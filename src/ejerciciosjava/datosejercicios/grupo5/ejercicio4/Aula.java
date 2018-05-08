/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Aula implements Serializable {

	private static final long serialVersionUID = 1L;

	//ATRIBUTOS
	private String nombre;
	private File archivo;
//	private Profesor propietario;
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	//CONSTRUCTOR
	Aula(String nombre) {
		this.nombre = nombre;
		File carpeta = new File(".\\profesor");
		carpeta.mkdirs();
		this.archivo = new File(carpeta, nombre);
		//Creamos ruta y archivo

	}

	//GETTER && SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void addAlumno(Alumno newAlumno) {
		this.listaAlumnos.add(newAlumno);
	}

	//METODOS HEREDADOS
	//METODOS PUBLICOS
	public int searchAlumnoByCodigo(int codAlumno) {
		for (Alumno al : this.listaAlumnos) {
			if (al.getCodAlumno() == codAlumno) {
				return listaAlumnos.indexOf(al);
			}
		}
		return -1;
	}

	public void saveToByteFile() {
		System.out.println("Guardando archivo en " + this.archivo + ".dat");
		try {
			try (ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(this.archivo + ".dat"))) {
				for (Alumno al : this.getListaAlumnos()) {
					oos.writeObject(al);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void loadFromByteFile() {
		try {
			// Se crea un ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(this.archivo + ".dat"));

			// Se lee el primer objeto
			Object aux = ois.readObject();

			// Mientras haya objetos
			while (aux != null) {
				if (aux instanceof Alumno) {
					System.out.println(aux);
				}
				aux = ois.readObject();
			}
			ois.close();
		} catch (EOFException e1) {
			System.out.println("Fin de fichero");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void saveToTxtFile() {
		System.out.println("Guardando archivo en " + this.archivo + ".txt");
		String st = "";

		try {
			//SE CREA UN OBJETO DE TIPO BUFFEREDWRITER PARA PODER ESCRIBIR DENTRO DEL ARCHIVO

			BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo + ".txt"));

			for (Alumno al : this.getListaAlumnos()) {
				st += al.toTxtFile();
			}
			bw.write(st);
			bw.close();
		} catch (Exception ex) {
			//Captura un posible error le imprime en pantalla
			System.out.println(ex.getMessage());

		}

	}

	public void loadFromTxtFile() {

		//Control de zonas de datos
		int cantAlum=0;
		boolean isAlumno = false;
		boolean isLenguaje = false;
		boolean isContacto = false;
		boolean isDireccion = false;
		// Campos para guardar los datos que usaremos para crear el Alumno
		int alumCod = 0;
		String perDni = "";
		String perNombre = "";
		String perApell = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyy", new Locale("ES"));
		Calendar perFechaNac = Calendar.getInstance();
		Calendar perFechaIng = Calendar.getInstance();
		EstadoCivil perEstado = null;
		TipoEstudio perEstudio = null;
		int perPosContact = 0;
		int perPosDir = 0;
		Lenguaje[] lenguaje= {Lenguaje.C,Lenguaje.C};
		try {
			// Apertura del fichero y creacion de BufferedReader para leer cada linea con readLine()).
			FileReader fr = new FileReader(this.archivo + ".txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			//Interpretación de cada línea leida acorde con la creación del fichero.txt (pa fliparlo)
			int lineaAlumno = 0;
			//Para todas las líneas
			while ((linea = br.readLine()) != null) {
				//Cada vez que se encuentre un alumno reinicia el contador de lineas
				if (linea.equals("--ALUMNO--")) {
					if(cantAlum!=0){
					Alumno al =new Alumno(alumCod, perFechaIng, perEstudio, lenguaje, perDni, perNombre, perApell, perFechaNac, perEstado);
					this.listaAlumnos.add(al);
					}
					cantAlum++;
					isAlumno = true;
					isLenguaje = false;
					isContacto = false;
					isDireccion = false;
					lineaAlumno = 0;
				}
				//las 10 primeras líneas son campos fijos
				switch (lineaAlumno) {
					case 1:
						alumCod = Integer.parseInt(linea);
						break;
					case 2:
						perDni = linea;
						break;
					case 3:
						perNombre = linea;
						break;
					case 4:
						perApell = linea;
					case 5:

						try {
							perFechaNac.setTime(formato.parse(linea));
						} catch (ParseException ex) {
							Logger.getLogger(Aula.class.getName()).log(Level.SEVERE, null, ex);
						}

						break;
					case 6:

						try {
							perFechaIng.setTime(formato.parse(linea));
						} catch (ParseException ex) {
							Logger.getLogger(Aula.class.getName()).log(Level.SEVERE, null, ex);
						}

						break;
					case 7:
						perEstado = EstadoCivil.valueOf(linea);
						break;
					case 8:
						perEstudio = TipoEstudio.valueOf(linea);
						break;
					case 9:
						perPosContact = Integer.parseInt(linea);
						break;
					case 10:
						perPosDir = Integer.parseInt(linea);

						break;
				}
				if (linea.equals("--LENGUAJE--")) {

				}
				lineaAlumno++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int i;
		Aula miAula = new Aula("IFCT0609");
//		Creamos alumnos automaticos y los añadimos al aula
//		for (i = 0; i < 10; i++) {
//			Alumno alumno = new Alumno();
//			alumno.addContacto(new Contacto(TipoContacto.EMAIL, "micorreo@gmail.com"));
//			alumno.addDireccion(new Direccion("Avenida", "Castelao", "2", "4", "a", "36200"));
//			miAula.addAlumno(alumno);
//		}

//		Busca un una ficha concreta de alumno por código
//		System.out.print("Indica codigo del alumno: ");
//		System.out.println(miAula.listaAlumnos.get(miAula.searchAlumnoByCodigo(leer.nextInt())));
//		Guarda datos en archivo.txt
//		miAula.saveToTxtFile();
//		Carga datos de archivo.txt
		miAula.loadFromTxtFile();

//		Guarda objeto miAula en archivo binario
//		miAula.saveToByteFile();
//		Carga los datos de miAula de archivo binario


//		 Muestra todos los alumnos del aula
		for (Alumno al : miAula.getListaAlumnos()) {
			System.out.println(al.toString());
		}
		// Cantidad de alumnos en aula
		System.out.println("Cantidad alumnos en el aula: " + miAula.getListaAlumnos().size());
	}
}
