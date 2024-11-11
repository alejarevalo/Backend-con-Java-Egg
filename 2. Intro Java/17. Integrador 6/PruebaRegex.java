import java.util.Scanner;

public class PruebaRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = "";

        System.out.println("Ingrese el nombre del alumno:");
        nombre = scan.nextLine().trim();

        // Expresión regular simplificada para aceptar letras con y sin acentos, y espacios [[NO FUNCIONA]]
        if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("El nombre es válido.");
        } else {
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("Nombre inválido.");
        }

        scan.close();
    }
}
