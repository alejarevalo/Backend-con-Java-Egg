/*Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego 
utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Ingrese un número entero: ");
        int number  = sc.nextInt();
        String strNumber = String.valueOf(number);
        int centinel = 0;
        for (int i = 0; i < strNumber.length();i++){
            if (Character.isDigit(strNumber.charAt(i))){//se recorre cada "numero" y si es un dígito
                centinel++; //entonces crece el contador
            }
        } 
        System.out.printf("Hay un total de %d dígitos.",centinel); 

        }catch (InputMismatchException e) {
            //e.printStackTrace(); 
            System.out.println("La entrada no es un número entero: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        sc.close();
    }
}
