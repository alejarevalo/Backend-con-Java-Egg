/*1. Pide al usuario que ingrese dos números, y:
    A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. 
    B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
    C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
    A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
    B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
*/
import java.util.Scanner;

public class EjercicioComparacion {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int b = sc.nextInt();

        boolean resultado =  a > b;
        boolean resultado2 = a == b;
        boolean resultado3 = a%2 == 0;
        String mensaje = "El primer número es mayor que el segundo ? = ";
        String mensaje2 = "El primer número es igual al segundo ? = ";
        String mensaje3 = "El primer número es divisible por dos ? = ";
        
        boolean esMayor = resultado ? true : false;
        boolean esIgual = resultado2 ? true : false; 
        boolean esPar = resultado3 ? true : false;


        System.out.println(mensaje+esMayor);
        System.out.println(mensaje2+esIgual);
        System.out.println(mensaje3+esPar);

        System.out.println("Ingresa el número 3: ");
        int c = sc.nextInt();
        System.out.println("Ingresa el número 4: ");
        int d = sc.nextInt();
        sc.close(); //cierra sc

        String mensaje4 = "El primer número es igual al segundo Y el tercero igual al cuarto? = ";
        String mensaje5 = "El primer número es igual al segundo O el tercero igual al cuarto? = ";

        boolean resultado4 =  a > b && c > d;
        boolean resultado5 =  a > b || c > d;

        boolean esMayorYMayor = resultado4 ? true : false; // si a es mayor que b Y c es mayor que d        
        boolean esMayorOMayor = resultado5 ? true : false; // si a es mayor que  b O c es mayor que d

        System.out.println(mensaje4+esMayorYMayor);
        System.out.println(mensaje5+esMayorOMayor);

    }    
}
