/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Define campos y métodos heredables.
 *
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public abstract class Persona {

	//ATRIBUTOS
	private String dni;         // DNI de la persona * Sirve como código
	private String nombre;      // Nombre de la persona
	private String apellidos;   // Todos los apellidos
	private Calendar fechaNac;  // Fecha de nacimiento
	private EstadoCivil estado; // Estado civil - es enum
	private ArrayList<Direccion> direcciones = new ArrayList<>(); // Lista de direcciones de la persona
	private int posDirPorDefecto;
	private ArrayList<Contacto> contactos = new ArrayList<>();   // Lista de formas de contacto de la persona
	private int posContactPorDefecto;
	private  TipoEstudio estudioSuperior;
	//ATRIBUTO DE CLASE
	protected static int CANTPERSONAS;

	//CONSTRUCTOR
	public Persona() {
		++Persona.CANTPERSONAS;
		this.dni = "2222222-"+CANTPERSONAS;
		this.nombre = "nombre"+CANTPERSONAS;
		this.apellidos = "apellido"+CANTPERSONAS;
		this.fechaNac = new GregorianCalendar(100,11,10);
		this.estado = EstadoCivil.CASADO;
		this.estudioSuperior = estudioSuperior;
		this.direcciones.add(new Direccion("Calle", "Mentira", "0", "0º", "0", "0000"));
		this.posDirPorDefecto = 0;
		this.contactos.add(new Contacto(TipoContacto.TELEFONO, "000 00 00 00"));
		this.posContactPorDefecto = 0;
	}
        	public Persona(String dni, String nombre, String apellidos, Calendar fechaNacimiento, EstadoCivil estado,TipoEstudio estudioSuperior) {
		++Persona.CANTPERSONAS;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNacimiento;
		this.estado = estado;
		this.estudioSuperior = estudioSuperior;
		this.posDirPorDefecto = 0;
		this.posContactPorDefecto = 0;
	}

	//GETTER&SETTER
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public EstadoCivil getEstadoCivil() {
		return estado;
	}

	public void setEstadoCivil(EstadoCivil estado) {
		this.estado = estado;
	}
	public TipoEstudio getEstudioSuperior() {
		return estudioSuperior;
	}
	public void setEstudioSuperior(TipoEstudio estado) {
		this.estudioSuperior = estado;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public String getStringFechaNac() {
		//definimos un formato de fecha
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyy", new Locale("ES"));
		//pasamos a String
		return formato.format(this.fechaNac.getTime());
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getPosDirPorDefecto() {
		return posDirPorDefecto;
	}

	public void setPosDirPorDefecto(int posDirPorDefecto) {
		this.posDirPorDefecto = posDirPorDefecto;
	}

	public int getPosContactPorDefecto() {
		return posContactPorDefecto;
	}

	public void setPosContactPorDefecto(int posContactPorDefecto) {
		this.posContactPorDefecto = posContactPorDefecto;
	}

	public static int getCANTPERSONAS() {
		return CANTPERSONAS;
	}

	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}

	public void addDireccion(Direccion dir) {
		this.direcciones.add(dir);
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void addContacto(Contacto contacto) {
		this.contactos.add(contacto);
	}

}
