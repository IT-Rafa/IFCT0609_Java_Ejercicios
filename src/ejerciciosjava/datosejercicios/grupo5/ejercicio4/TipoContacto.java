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
public enum TipoContacto {
    TELEFONO {
        @Override
        public String toString() {
            return "Teléfono: ";
        }

    }, EMAIL {
        @Override
        public String toString() {
            return "E-Mail: ";
        }

    }, OTROS {
        @Override
        public String toString() {
            return "OTROS: ";
        }

    }
}
