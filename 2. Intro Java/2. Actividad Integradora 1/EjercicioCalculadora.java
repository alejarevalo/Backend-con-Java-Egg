import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el primer operando: ");
    int y = sc.nextInt();
    System.out.print("Ingrese el segundo operando: ");
    int x = sc.nextInt();
    System.out.print("Ingrese un operador: ");
    char operando = sc.next().charAt(0);

    sc.close();

        switch (operando) {
            case '+':
            System.out.printf("El resultado de la suma es: %d\n", x + y); //formato es para no concatenar, y en ese formato el %d para enteros 

            break;
            case '-':
            System.out.printf("El resultado de la resta es: %d\n", x + y);
            break;
            case '*':
            System.out.printf("El resultado de la multiplicación es: %d\n", x + y);
            break;
            case '/':
            System.out.printf("El resultado de la división es: %d\n", x + y);
            break;
            case '%':
            System.out.printf("El resultado del módulo es: %d\n", x + y);
            break;
            }
    }
}