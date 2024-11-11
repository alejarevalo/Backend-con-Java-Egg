/*Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). 
Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra
un mensaje al usuario indicando que la entrada no es un número válido. */

import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Ingrese un número: ");
        String numeroCadena = sc.nextLine();
        
        Double numero = Double.valueOf(numeroCadena);
        System.out.printf("%.2f quedó transformado a double.",numero); // %f se utiliza para imprimir valores de tipo float o double.
            // %.2f indica que queremos mostrar el número con 2 decimales después del punto (puedes cambiar el número 2 para mostrar más o menos decimales).
        } catch (NumberFormatException e) { //Se lanza cuando se intenta convertir una
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