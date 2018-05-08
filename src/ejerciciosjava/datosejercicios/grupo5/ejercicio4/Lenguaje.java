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
public enum Lenguaje {
    JAVA {
        @Override
        public String toString() {
            return "Java";
        }

    }, C {
        @Override
        public String toString() {
            return "C";
        }

    }, CSHARP {
        @Override
        public String toString() {
            return "C#";
        }

    }, JAVASCRIPT {
        @Override
        public String toString() {
            return "JavaScript";
        }

    }
}
