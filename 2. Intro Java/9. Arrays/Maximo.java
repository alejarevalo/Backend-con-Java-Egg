/*Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos 
de tipo entero, ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola 
el resultado utilizando solamente las herramientas adquiridas hasta el momento. */

import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingresa los cinco elementos del array:");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        sc.close();
        int numMax =  numeros[0];

        if (numMax < numeros[1]) { // si max es menor al del array, pues max se vuelve ese del array
            numMax = numeros[1];
        } 
        if (numMax < numeros[2]) {
            numMax =  numeros[2];
        } 
        if (numMax < numeros[3]) {
            numMax = numeros[3];
        } 
        if (numMax < numeros[4]) {
            numMax = numeros[4];
        }
        /* Otra forma sería con un método de Math llamado Math.max:
        int numMax =  Math.max(numeros[0], Math.max(numeros[1]);
        numMax = Math.max(numMax, numeros[2]);
        numMax = Math.max(numMax, numeros[3]);
        numMax = Math.max(numMax, numeros[4]);
        */

        System.out.println("El número máximo es: "+numMax);

    }
}
