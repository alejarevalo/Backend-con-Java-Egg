/*Escribe un programa que pida al usuario un número positivo y calcule su raíz 
cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es 
negativo, muestra un mensaje adecuado en pantalla. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaizCuadrada{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        try{
            System.out.println("Ingrese un número positivo");
            num = sc.nextDouble();      
        } catch (InputMismatchException e){
            e.getMessage();
            System.out.println("No ingresaste un número");
        } 
        String mensaje = (num < 0) ? ("El número ingresado es negativo") : ("La raiz cuadrada del número es: "+Math.sqrt(num));
        System.out.println(mensaje);        
        sc.close();
    }
}