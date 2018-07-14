/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class Tarea{
    public static void main(String arg[]) {

        System.out.println("-> Persona 1");
        PersonaI m = new PersonaI();
        m.imprimirInformacion();

        System.out.println("-> Persona 2");
        PersonaII ada = new PersonaII();
        ada.imprimirInformacion();

        System.out.println("-> Persona 3");
        PersonaIII ii = new PersonaIII();
        ii.imprimirInformacion();
    }

    public static class Asignatura {
        private String nombre;
        private String codigo;
        private String carrera;
        private int periodo;
        private int UV;

        public Asignatura() {
           
        }
        public Asignatura(String nombre,
                          String codigo,
                          String carrera,
                          int periodo,
                          int UV) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.carrera = carrera;
            this.periodo = periodo;
            this.UV = UV;
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

        public int getPeriodo() {
            return this.periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }
        
        public int getUV() {
            return this.UV;
        }

        public void setUV(int UV) {
            this.UV = UV;
        }
        
        public void imprimirInformacion() {
            System.out.println("");
            System.out.println("Nombre: " + nombre);
            System.out.println("Codigo: " + codigo);
            System.out.println("Carrera: " + carrera);
            System.out.println("Periodo: " + periodo);
            System.out.println("UV: " + UV);
            System.out.println("");
        }
    }

    public static class PersonaI extends Asignatura {
        public PersonaI() {
            setNombre("Brayan Albeto Licona Hernandez");
            setCodigo("201710120146");
            setCarrera("INGENIERIA EN COMPUTACION");
            setPeriodo(5);
            setUV(5);
        }
    }

    public static class PersonaII extends Asignatura {
        public PersonaII() {
            super("Jose Arturo Gomez Perez", "201710120024", "INGENIERIA EN COMPUTACION", 3, 2);
        }
    }

    public static class PersonaIII extends Asignatura {
        public PersonaIII() {
            setNombre("Bayron Noe Ruiz Perez");
            setCodigo("201810120045");
            setCarrera("INGENIERIA INDUSTRIAL");
            setPeriodo(1);
            setUV(3);
        }
    }
}

