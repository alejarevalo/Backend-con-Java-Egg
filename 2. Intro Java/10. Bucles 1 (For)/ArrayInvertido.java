// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se 
//convierta en el último y viceversa, luego imprime el array resultante por consola. El tamaño y los números 
//a contener pueden ser de tu elección.

// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer 
//uso de **elementos auxiliares** para concluir el ejercicio.

import java.util.Scanner;

public class ArrayInvertido {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Ingresa un número en la posición %d: ", i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) { /*se divide en dos porque el bucle solo necesita recorrer 
            hasta la mitad del array porque en cada iteración intercambiamos dos posiciones a la vez: 
            una posición del principio con una posición del final. Al hacer estos intercambios, los elementos 
            del final ya estarán en el lugar correcto después de haber recorrido la mitad del array. */ 
            int temp = arr[i]; // guardamos la primera posicion de la iteracion en una variable auxiliar
            arr[i] = arr[(arr.length - 1) - i]; // es -i porque necesitamos que la posición final disminuya con cada iteración
            arr[(arr.length - 1) - i] = temp; // ahora la posición final recibe el valor de la posición inicial

        }

        System.err.println("Array invertida:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]", arr[i]);
        }

        sc.close();
    }
}
