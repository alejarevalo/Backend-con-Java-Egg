package src;
import java.util.Scanner;

public class ObtenerNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\033\143");
        System.out.println("Este programa validará una puntuación y mostrará la calificación correspondiente");
        System.out.print("Por favor, ingresa una calificación de 0 a 100: ");
        int cal = teclado.nextInt();
        if (cal <= 100 && cal >= 0) {
            System.out.println("La nota es: " + obtenerNota(cal));
        } else {
            System.out.println("Ingrese una nota valida");
        }
        teclado.close();
    }

    public static String obtenerNota(int calificacion) {
        String nota = switch (calificacion / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
        return nota;
    }

}