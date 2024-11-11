/*Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos
 de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar
  los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas 
adquiridas hasta el momento. */

import java.util.Scanner;

public class SumaYPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        System.out.println("Ingresa los cuatro elementos del array:");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        sc.close();
        int suma = numeros[0]+numeros[1]+numeros[2]+numeros[3];
        double  promedio = (double)suma/numeros.length; // length es una propiedad y no un método :)

        System.out.println("La suma de los elementos es: "+suma);
        System.out.println("El promedio de los elementos es: "+promedio);
    }
}
