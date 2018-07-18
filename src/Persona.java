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

    public static abstract class Personas {
        private String nombre;
        private String codigo;
        private String carrera;
        private int periodoest;
        private int indice;

        public Personas() {
     
        }
        public Personas(String nombre,
                          String codigo,
                          String carrera,
                          int periodoest,
                          int indice) {
            this.nombre = nombre;

            this.codigo = codigo;

            this.carrera = carrera;

            this.periodoest = periodoest;

            this.indice = indice;
        }
        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getCodigo() {
            return this.codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public String getCarrera() {
            return this.carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
        public int getPeriodoest() {
            return this.periodoest;
        }

        public void setPeriodoest(int periodoest) {
            this.periodoest = periodoest;
        }
        public int getindice() {
            return this.indice;
        }

        public void setindice(int indice) {
            this.indice = indice;
        }

        public void imprimirInformacion() {
            System.out.println("");

            System.out.println("Nombre: " + nombre);

            System.out.println("Codigo: " + codigo);

            System.out.println("Carrera: " + carrera);

            System.out.println("Año De Estudio: " + periodoest);

            System.out.println("Indice: " + indice);

            System.out.println("Informacion: " + getPersonasInformacion());

            System.out.println("");
        }
    
    } abstract String getPersonasInformacion();

    }
    

  

