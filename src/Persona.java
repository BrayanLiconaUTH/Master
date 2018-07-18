/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Maldonado
 */

  public class Persona {

    public static void main(String arg[]) {
       
        System.out.println("-> Estudiante ");
         Estudiante m = new Estudiante();
         m.imprimirInformacion();
         
        System.out.println("-> Deportista");   
        Deportista ada = new Deportista();
        ada.imprimirInformacion();
    }

  }
    

  

