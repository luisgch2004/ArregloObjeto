public class Arreglo {
    private Alumno[] alumnos;
    private int numAlumnos;

    public Arreglo(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        alumnos = new Alumno[numAlumnos];
    }

    public void ingresarDatosAlumnos() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingresando datos del alumno " + (i + 1) + ":");
            alumnos[i] = new Alumno();
            alumnos[i].ingresarDatos();
        }
    }

    public void mostrarDatosAlumnos() {
        System.out.println("\nDatos de los alumnos ingresados:");
        for (int i = 0; i < numAlumnos; i++) {
            alumnos[i].mostrarDatos();
        }
    }

}
