import java.util.Scanner;
/*Aplica lo aprendido resolviendo los siguientes ejercicios:

Declara dos variables, y asígnales un valor a cada una de ellas.

Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. 
Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;

Posteriormente, pide al usuario que ingrese dos números,
 guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola. */

public class EjercicioOperacionesBasicas {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int x = sc.nextInt();
    System.out.println("Ingrese otro número: ");
        int y = sc.nextInt();
    System.out.println("Ingrese un operador (/):");
    char operando = sc.next().charAt(0);
        
    switch (operando){
        case '+':
        System.out.println("La suma de las dos variables es: " +(x+y));

        break;
        case '-':
        System.out.println("La resta de las dos variables es: "+(x-y));

        break;
        case '*':
        System.out.println("La multiplicación de las dos variables es:  "+(x*y));

        break;
        case '/':
        if (y != 0) {
            System.out.println("El residuo de dividir la primera variable con la segunda es: "+(x/y));
            } else  {
               System.out.println("Error: no se puede dividir por cero");
               }   
        break;
        case  '%':
        if (y != 0) {
         System.out.println("El residuo de dividir la primera variable con la segunda es: "+(x%y));
         } else  {
            System.out.println("Error: no se puede calcular residuo con divisor cero");
            }   
        break;       
    }

    sc.close();

    }
}
