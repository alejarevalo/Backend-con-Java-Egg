/* Escribe un programa que solicite al usuario ingresar una serie de números enteros. 
Utiliza un bucle while para contar la cantidad de números pares e impares ingresados 
hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad 
de números pares e impares ingresados*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int contadorPares = 0, contadorImpares = 0, numero;
        boolean seguir = true;
        try {
            while (seguir == true) {           
                System.out.println("Ingresa un número entero (0 para terminar):");
                numero = sc.nextInt();
                if  (numero == 0) {
                    seguir = false;
                } else {
                    if (numero % 2 == 0) 
                    contadorPares++;
                    else contadorImpares++;
                }//first if end
            }//while end
        }catch (InputMismatchException e){
            System.out.println("Error: Debes ingresar un número entero: "  + e.getMessage());
        }

        sc.close();
        System.out.printf("Cantidad de pares: %d.\nCantidad de impares: %d.", contadorPares, contadorImpares);
    }
}
