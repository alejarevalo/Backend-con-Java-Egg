/*Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla 
su longitud utilizando el método length() de la clase String. */

import java.util.Scanner;

public class LongitudPalabra {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Ingrese una palabra: ");
    String palabra = sc.nextLine();
    System.out.println("La longitud de la palabra ingresada es: "+palabra.length());

    sc.close();
    }//end main
}//end class