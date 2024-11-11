/*Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente 
en el array. El tamaño y los números  a contener pueden ser de tu elección. */

import java.util.Scanner;

public class ValorMinimo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Ingresa un número en la posición %d: ", i);
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
                System.out.printf("%d\n", min);
            }
        }

        sc.close();
    }
}
