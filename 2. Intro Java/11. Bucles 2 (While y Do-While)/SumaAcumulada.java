/*Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. 
Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después de cada entrada de número, 
pregunta al usuario si desea ingresar otro número. Si el usuario responde afirmativamente, continúa solicitando 
números; de lo contrario, muestra la suma acumulada de todos los números ingresados y termina el programa. */

import java.util.Scanner;

public class SumaAcumulada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        boolean seguir = true;
        String opcion = "";
        do {
            System.out.println("Ingresa un número entero positivo");
            int num = sc.nextInt();
            suma += num;
            do { //Es para verificar que realmente el usuario ponga el String correcto
                System.out.println("¿Desea ingresar otro número? (S/N)");
                opcion = sc.next().toUpperCase();

                if (opcion.equalsIgnoreCase("N")){
                    seguir = false;
                } else if  (opcion.equalsIgnoreCase("S")){
                    seguir = true;
                } else {
                    System.out.println("Ingresaste una opción inválida.");
                }
            } while (!opcion.equalsIgnoreCase("N") && !opcion.equalsIgnoreCase("S"));
        } while (seguir == true);
        
        sc.close();
        System.out.printf("La suma acumulada de los números ingresados es: %d", suma);

    }
}
