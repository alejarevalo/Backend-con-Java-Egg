/*Pídele al usuario que introduzca una cadena que represente un número entero y luego otra cadena que 
represente un número decimal. Convierte cada cadena al tipo de dato correspondiente utilizando los métodos 
valueOf, suma sus valores e imprímelos por consola. */

import java.util.Scanner;

public class NumbersSum {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número entero: ");
            String input1 = sc.nextLine();
            int number1 = Integer.valueOf(input1);
            System.out.println("Ahora ingrese un número decimal (0.0): ");
            String input2 = sc.nextLine();
            double number2 = Double.valueOf(input2);
            double sum =  number1 + number2;
            System.out.printf("La suma de %d y de %.2f es: %.2f", number1, number2, sum);

        }catch (NumberFormatException e) { //Se lanza cuando se intenta convertir una
            //cadena a un tipo numérico, pero la cadena no tiene el formato adecuado
            //para ello.
            //e.printStackTrace();
            System.out.println("La entrada no es un número valido: "+e.getLocalizedMessage()); //este lanza la excepción en el idioma de la region configurada
        }catch (Exception e){//pero depende si "está disponible", si no, simplemente lanza lo mismo que e.getMessage()
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        sc.close();
  }  
}
