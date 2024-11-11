/*Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente 
y posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta 
el momento. */

//import java.util.Arrays;
import java.util.Scanner;

public class OrdenarElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[4];
        System.out.println("Ingresa los cuatro nombres");
        nombres[0] = sc.nextLine();
        nombres[1] = sc.nextLine();
        nombres[2] = sc.nextLine();
        nombres[3] = sc.nextLine();
        sc.close();
        // Comparar nombre1 con nombre2
        System.out.println("comparacion 1: "+(nombres[0].compareToIgnoreCase(nombres[1])));
        if (nombres[0].compareToIgnoreCase(nombres[1]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        // Comparar nombre1 con nombre3
        if (nombres[0].compareToIgnoreCase(nombres[2]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[2];
            nombres[2] = temp;
        }

        // Comparar nombre1 con nombre4
        if (nombres[0].compareToIgnoreCase(nombres[3]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[3];
            nombres[3] = temp;
        }

        // Comparar nombre2 con nombre3
        if (nombres[1].compareToIgnoreCase(nombres[2]) > 0) {
            String temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }

        // Comparar nombre2 con nombre4
        if (nombres[1].compareToIgnoreCase(nombres[3]) > 0) {
            String temp = nombres[1];
            nombres[1] = nombres[3];
            nombres[3] = temp;
        }

        // Comparar nombre3 con nombre4
        if (nombres[2].compareToIgnoreCase(nombres[3]) > 0) {
            String temp = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = temp;
        }

        //O... Se puede usar un método de la clase Arrays que no hemos visto (hay q' importarla):
        //  Arrays.sort(nombres);
        
        //solo para mostrar
        for (int i = 0; i < nombres.length; i++) {
        System.out.println(" ["+nombres[i]+"] ");
        };

    }//main end
}//class end
