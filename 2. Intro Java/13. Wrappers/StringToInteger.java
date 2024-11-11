/*Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner.
 Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer. */

import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número entero: ");
            String input = sc.nextLine();
            int number = Integer.valueOf(input);
            // Integer.parseInt(input);
            System.out.printf("El la cadena '%d' fue transformada a entero.", number);
        }catch (NumberFormatException e) { //Se lanza cuando se intenta convertir una
            //cadena a un tipo numérico, pero la cadena no tiene el formato adecuado
            //para ello.
            //e.printStackTrace();
            System.out.println("La entrada no es un número valido: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        sc.close();
        
    }//main
}//class
