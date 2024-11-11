/*Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y
* devuelva un valor entero que corresponda al cálculo del factorial del número
* proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de
* manera recursiva.
*/

import java.util.Scanner;

public class factorial_recursivo {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= num);
        System.out.println("Método (do while): El factorial de " + num + " es: " + factorial);
        System.out.println("Método (recursivo): El factorial de " + num + " es: " + factorial(num));

        sc.close();
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }

    }
}
