/*Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena 
y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al
usuario indicando si la cadena contiene solo letras o no. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputIsLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int centinel  = 0;
        try {
            System.out.println("Enter a string:");
            input = sc.nextLine();
            for (int i = 0; i < input.length();i++){
                if (Character.isLetter(input.charAt(i))){//se recorre cada letra y si es letra
                    centinel++; //entonces crece el contador
                }
            } 
            if (centinel == input.length()){//si contador es igual a la longitud de la cadena, todas son letras
                System.out.println("Yes, they're all letters.");
            } else {
                System.out.println("No, they're not all letters.");
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid input. "+e.getLocalizedMessage());
        }catch (Exception e){
            System.out.println("An error occurred. "+e.getMessage());
        }
        sc.close();
    }//main
}//class
