import java.util.Scanner;

public class Alumno {
    private String codigo;
    private String nombre;
    private int promedioFinal;
    public Alumno() {
        this.codigo = "";
        this.nombre = "";
        this.promedioFinal = 0;
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el código del alumno: ");
        this.codigo = sc.nextLine();

        System.out.print("Ingrese el nombre del alumno: ");
        this.nombre = sc.nextLine();

        System.out.print("Ingrese el promedio final del alumno: ");
        this.promedioFinal = sc.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Promedio Final: " + this.promedioFinal);
        System.out.println();
    }
}
