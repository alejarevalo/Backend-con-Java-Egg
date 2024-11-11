import java.util.Scanner;

public class FibonacciMejMetodos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\033\143");

        System.out.print("Ingresa la posición en la serie de Fibonacci: ");
        int posicion = sc.nextInt();
        sc.close();

        System.out.println("El número en la posición " + posicion + " de la serie de Fibonacci es: " + fibonacci(posicion));

    }

    public static int fibonacci(int posicion) {
        if (posicion < 2) {
            return posicion;
        } else {
            return fibonacci(posicion - 1) + fibonacci(posicion - 2); // ejm: posicion 6 -> f(6-1) + f(6-2) -> f(5) + f(4) -> 5 + 3 = 8
        }
    }
}