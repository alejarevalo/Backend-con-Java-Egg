import java.util.Scanner;

public class IfDivisiblepor5por3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese un Numero : ");
        System.out.println("Le dire si es divisible por 5, por 3, ambos o ninguno");
        System.out.println("-------------------------------------");

        float number = scanner.nextFloat();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("El numero es divisible por 5 y por 3!");
        } else if (number % 3 == 0) {
            System.out.println("El numero es divisible por 3!");
        } else if (number % 5 == 0) {
            System.out.println("El numero es divisible por 5!");
        } else {
            System.out.println("El numero NO es divisible por 5 ni 3");
        }

        scanner.close();
    }
}