/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class Personas {
  public static class Deportista extends Personas {

        public Deportista() {
            super("Jose Alberto Hernandez Lopez", "201510120445", "Licenciatura En Relaciones Industriales", 5, 78);
        }
        public String getPersonasInformacion() {
            return "Informacion Del Deportista: Jose Alberto Hernandez Lopez.";
        }

    }  
}
