/*Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor 
absoluto utilizando el método abs() de la clase Math. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int valorAbsoluto = 0;
        try{
            System.out.println("Ingrese un número entero: ");
            numero = sc.nextInt();
            valorAbsoluto = Math.abs(numero);
        } catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un número entero.");    
        }

        System.out.println("Su número absoluto es: "+valorAbsoluto);
        sc.close();
    }//main end
}//class end