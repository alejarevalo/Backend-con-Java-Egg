import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception1ej2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número: ");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese un segundo número: ");
            int num2 = scanner.nextInt();
            double resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Uno de los números es incorrecto");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Falta ingresar un número " + e.getMessage());
        }
        scanner.close();
    }
}