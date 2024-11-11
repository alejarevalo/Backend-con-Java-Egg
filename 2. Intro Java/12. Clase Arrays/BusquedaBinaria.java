/*La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. 
La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice 
una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe 
imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor 
buscado si está presente en el arreglo. */

import java.util.Scanner;
import java.util.Arrays;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {   
         arreglo[i] = (int) (Math.random() * 100-1+1) + 1;
       }
       System.out.println("Arreglo original: " + java.util.Arrays.toString(arreglo));
       System.out.println("Ingrese el valor a buscar: ");
       int valorBuscado = sc.nextInt();
       sc.close();
       int index = Arrays.binarySearch(arreglo, valorBuscado);
       System.out.println("El índice del valor buscado es "+index);

    }//main
}//class
