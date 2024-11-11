/*Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. 
Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque 
"try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. 
En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla. */

import java.util.Scanner;

public class Exception1_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número que quieres convertir a entero: ");
        String numeroPalabras = sc.nextLine();
        int numeroEntero = 0; //toca inicializarlo antes del try
        try {
            numeroEntero = Integer.parseInt(numeroPalabras);
            System.out.println("El número entero es: " + numeroEntero);
        } catch (NumberFormatException e) { // se intenta convertir una cadena a un tipo numérico, pero la cadena no tiene el formato adecuado
            e.printStackTrace();
            System.out.println("Ha ingresado caracteres que no corresponden a un número: "+e.getMessage());
        } catch  (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

        sc.close();
    }
}
