/*El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número 
al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar
 únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso. */

import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {2,9,7};
        System.out.println("\nIngresa el número que quieras buscar en el array:");
        int num = sc.nextInt();
        sc.close();
        if (numeros[0] == num)
        System.out.println("\nElemento encontrado en la posición 1.\n");
        else if (numeros [1] == num)
        System.out.println("\nElemento encontrado en la posición 2.\n");
        else if (numeros[2] == num)
        System.out.println("\nElemento encontrado en la posición 3.\n");
        else
        System.out.println("\nEl número no se encuentra en el array.\n");

        
    }
}
