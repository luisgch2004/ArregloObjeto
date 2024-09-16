import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
            System.out.print("Ingrese el número de alumnos: ");
            int n = consola.nextInt();
            var gestion = new Arreglo(n);
            gestion.ingresarDatosAlumnos();
            gestion.mostrarDatosAlumnos();
    }
}
