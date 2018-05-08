/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

/**
 *
 * @author Sistemas
 */
public class Direccion {
    //ATRIBUTOS
    private String tipoCalle;
    private String nombreCalle;
    private String numEdif;
    private String Piso;
    private String Puerta;
    private String CodigoPostal;
    
    //CONSTRUCTORES

    public Direccion(String tipoCalle, String nombreCalle, String numEdif, String Piso, String Puerta, String CodigoPostal) {
        this.tipoCalle = tipoCalle;
        this.nombreCalle = nombreCalle;
        this.numEdif = numEdif;
        this.Piso = Piso;
        this.Puerta = Puerta;
        this.CodigoPostal = CodigoPostal;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }


    public String getTipoCalle() {
        return tipoCalle;
    }

    public void setTipoCalle(String tipoCalle) {
        this.tipoCalle = tipoCalle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNumEdif() {
        return numEdif;
    }

    public void setNumEdif(String numEdif) {
        this.numEdif = numEdif;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public String getPuerta() {
        return Puerta;
    }

    public void setPuerta(String Puerta) {
        this.Puerta = Puerta;
    }

	@Override
	public String toString() {
		return  getTipoCalle() +" "+ getNombreCalle()
                    + ", nº: "+ getNumEdif() + " ;Piso: " + getPiso()
                    + " ;Puerta: "+getPuerta() + " ; Codigo Postal: "+ getCodigoPostal();
	}
    

}
