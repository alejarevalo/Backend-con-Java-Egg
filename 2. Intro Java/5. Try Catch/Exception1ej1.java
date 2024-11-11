import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception1ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo número: ");
        int num2 = scanner.nextInt();
        double resultado =  (double) num1 / num2; //el double entre parentesis es para que el resultado que necesite decimal lo use.
        // Eso se llama  casting, "forzar" la conversión de un tipo de dato a otro.
        // El problema es que si usas el casting de double, al dividir por cero no te saldrá la arithmeticException, sino Infinity :V

        System.out.println("El resultado de la división es: " + resultado);
    } catch (ArithmeticException e) { // por si se ingresa un 0
        e.printStackTrace();
        System.out.println("No se puede dividir por 0: "+e.getMessage());
    } catch (InputMismatchException e) { // por si no se ingresa un número
        e.printStackTrace();
        System.out.println("No se ingresó un número: "+e.getMessage());
    } catch (Exception e) { // por si ocurre otro tipo de error
        e.printStackTrace();
        System.out.println("Ocurrió un error inesperado " + e.getMessage());
    }

scanner.close();
    }
}
