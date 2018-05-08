/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public enum TipoEstudio {
    PRIMARIA{
        @Override
        public String toString() {
            return "Primaria";
        }
    
    },
    SECUNDARIA{
        @Override
        public String toString() {
            return "Secundaria";
        }
    
    },
    FP{
        @Override
        public String toString() {
            return "F.P.";
        }
    
    },
    UNIVERSIDAD{
        @Override
        public String toString() {
            return "Universidad";
        }
    
    },

}
