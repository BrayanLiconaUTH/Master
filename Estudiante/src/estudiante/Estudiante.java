/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author ADMIN
 */

    /**
     * @param args the command line arguments
     */
  
    public static class Estudiante extends Personas {

        public Estudiante() {
            setNombre("Juan Enrique Bonilla Diaz");

            setCodigo("201410120134");

            setCarrera("INGENIERIA EN COMPUTACION");

            setPeriodoest(2);

            setindice(93);
        }


        public String getPersonasInformacion() {
            return "Informacion Del Estudiante : Juan Enrique Bonilla Diaz ";
        }


    }

