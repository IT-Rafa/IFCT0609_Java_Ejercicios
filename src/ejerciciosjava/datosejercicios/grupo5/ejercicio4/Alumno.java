/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Define la clase Alumno
 */
public class Alumno extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	//ATRIBUTOS OBJETO
	private int codAlumno;
	private Calendar fechaInscr;
	private TipoEstudio estudioSuperior;   // Estudio superior hecho
	private Lenguaje[] estudiaLenguaje;   // Lista de lenguajes que estudia
	//ATRIBUTOS CLASE
	private static int CANTALUMNOS;

	//CONSTRUCTORES
	//Para usar realmente
	public Alumno(int codProf, Calendar fechaInscr, TipoEstudio estudioSuperior, Lenguaje[] estudiaLenguaje, String dni, String nombre, String apellidos, Calendar fechaNacimiento, EstadoCivil estado) {
		super(dni, nombre, apellidos, fechaNacimiento, estado, estudioSuperior);
		this.codAlumno = codProf;
		this.fechaInscr = fechaInscr;
		this.estudioSuperior = estudioSuperior;
		this.estudiaLenguaje = estudiaLenguaje;
		++Alumno.CANTALUMNOS;
	}

	//Por defecto - datos automáticos irreales
	public Alumno() {
		super(
				"11.111.11" + Alumno.CANTALUMNOS + "-D",
				"nombre" + Alumno.CANTALUMNOS,
				"apellidos" + +Alumno.CANTALUMNOS,
				new GregorianCalendar(2000, 5, 10),
				EstadoCivil.SOLTERO,
				TipoEstudio.UNIVERSIDAD);
		this.codAlumno = Alumno.CANTALUMNOS;
		this.fechaInscr = new GregorianCalendar(2000, 5, 10);
		this.estudioSuperior = TipoEstudio.UNIVERSIDAD;
		this.estudiaLenguaje = new Lenguaje[]{Lenguaje.C, Lenguaje.JAVA};
		++Alumno.CANTALUMNOS;
	}

//GETTER & SETTER
	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public Calendar getFechaInscr() {
		return fechaInscr;
	}

	public void setFechaInscr(Calendar fechaInscr) {
		this.fechaInscr = fechaInscr;
	}

	public Lenguaje[] getEstudiaLenguaje() {
		return estudiaLenguaje;
	}

	public void setEstudiaLenguaje(Lenguaje[] estudiaLenguaje) {
		this.estudiaLenguaje = estudiaLenguaje;
	}

	public static int getCANTALUMNOS() {
		return Alumno.CANTALUMNOS;
	}

	public String getStringFechaInscr() {
		//definimos un formato de fecha
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyy", new Locale("ES"));
		//pasamos a String y retornamos
		return formato.format(getFechaInscr().getTime());

	}

	public String toTxtFile() {
		
		String txt = "--ALUMNO--" + "\n" + this.getCodAlumno() + "\n" + this.getDni() + "\n" + this.getNombre() + "\n" + this.getApellidos() + "\n"
				+ this.getStringFechaNac() + "\n" + this.getStringFechaInscr() + "\n" + this.getEstadoCivil() + "\n"
				+ this.getEstudioSuperior() + "\n"
				+ this.getPosContactPorDefecto() + "\n"
				+ this.getPosDirPorDefecto() + "\n";
		txt +="--LENGUAJE--\n";
		for (Lenguaje leng : this.getEstudiaLenguaje()) {
			txt += leng.toString() + "\n";
		}
		txt +="--CONTACTO--\n";
		for (Contacto contacto : this.getContactos()) {
			txt += contacto.getTipo().toString() + "\n"
					+ contacto.getDesc() + "\n";
		}
		txt +="--DIRECCION--\n";
		for (Direccion dir : this.getDirecciones()) {
			txt += dir.getTipoCalle()+ "\n"
					+ dir.getNombreCalle() + "\n"
					+ dir.getNumEdif() + "\n"
					+ dir.getPiso() + "\n"
					+ dir.getPuerta() + "\n"
					+ dir.getCodigoPostal() + "\n";
		}
		return txt;
	}
	//METODOS HEREDADOS

	@Override
	public String toString() {
		int i;
		String listaLenguajes = "";
		String direcs = "";
		String contacts = "";

		for (Lenguaje l : this.getEstudiaLenguaje()) {
			listaLenguajes += l + ", ";
		}
		i = 0;
		for (Direccion dir : this.getDirecciones()) {
			i++;
			direcs += "\tDir. " + i + ": " + dir.toString();
			if (i == this.getPosDirPorDefecto()) {
				direcs += " * \n";
			} else {
				direcs += "\n";
			}
		}
		i = 0;
		for (Contacto contact : this.getContactos()) {
			i++;
			contacts += "\tModo contacto " + i + ": " + contact.toString();
			if (i == this.getPosContactPorDefecto()) {
				contacts += " * \n";
			} else {
				contacts += "\n";
			}

		}

		return "Alumno: Codigo: " + this.getCodAlumno() + "\n"
				+ "  Datos personales:" + "\n"
				+ "\tNombre: " + this.getNombre() + " " + this.getApellidos() + "\n"
				+ "\tDNI: " + this.getDni() + "\n"
				+ "\tFecha nacimiento: " + this.getStringFechaNac() + "\n"
				+ "  Datos alumno:" + "\n"
				+ "\tFecha Inscripcion: " + this.getStringFechaInscr() + "\n"
				+ "\tEstudio Superior: " + this.getEstudioSuperior() + "\n"
				+ "\tLenguajes que puede dar: " + listaLenguajes + "\n"
				+ "  Contactos: \n"
				+ contacts + "\n"
				+ "  Direcciones:\n"
				+ direcs + "\n";
	}

	public static void main(String[] args) {

		Alumno Alumno1 = new Alumno();
		Alumno1.addContacto(new Contacto(TipoContacto.EMAIL, "micorreo@gmail.com"));
		Alumno1.addDireccion(new Direccion("Avenida", "Castelao", "2", "4", "a", "36200"));
		System.out.println(Alumno1.toTxtFile());

		System.out.println("Cantidad personas: " + Persona.getCANTPERSONAS());
		System.out.println("Cantidad alumnos: " + Alumno.getCANTALUMNOS());

	}
}
