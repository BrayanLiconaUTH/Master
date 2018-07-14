
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

        abstract String getPersonasInformacion();

    }
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

    public static class Deportista extends Personas {

        public Deportista() {
            super("Jose Alberto Hernandez Lopez", "201510120445", "Licenciatura En Relaciones Industriales", 5, 78);
        }
        public String getPersonasInformacion() {
            return "Informacion Del Deportista: Jose Alberto Hernandez Lopez.";
        }

    }
    }
    

