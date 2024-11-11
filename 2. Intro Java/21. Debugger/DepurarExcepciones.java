import java.util.Scanner;

public class DepurarExcepciones {
    static Scanner scanner = new Scanner(System.in);
    static int opc;

    public static void main(String[] args) {

        do {
            menu();
        } while (opc != 5);
    }

    public static void menu() {
        System.out.println("Ingrese dos números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Ingrese la opción deseada:");
        System.out.println("1.- Sumar los números:");
        System.out.println("2.- Restar los números:");
        System.out.println("3.- Multiplicar los números:");
        System.out.println("4.- Dividir los números:");
        System.out.println("5.- Salir");
        opc = scanner.nextInt();

        switch (opc) {
            case 1 -> System.out.println("El resultado de la suma es: " + suma(num1, num2));

            case 2 -> System.out.println("Es resultado de la resta es: " + resta(num1, num2));

            case 3 -> System.out.println("Es resultado de la multiplicación es: " + multiplicacion(num1, num2));

            case 4 -> {
                try {
                    System.out.println("Es resultado de la división es: " + division(num1, num2));
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Error, no se puede dividir por cero");
                }
            }
            default -> {
                System.out.println("Opción no válida");
            }
        }

    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
}
