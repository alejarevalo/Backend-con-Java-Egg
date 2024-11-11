import java.util.InputMismatchException;
import java.util.Scanner;
public class SwitchVerificaDiaHabil {
    /*En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un
     día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera
      que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. 
      ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).) */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 7 (Lun-Dom):");
       try{
        int dia = sc.nextInt();

        String opcion = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Día hábil";
            case 6, 7 -> "Día no hábil";
            default -> "Opción no valida";
        };// end switch expression         
        System.out.println(opcion);
        } catch (InputMismatchException e){
            System.out.println("Error: Debes ingresar un número " + e.getMessage());
        }        
        sc.close();
    }//end main
}// end class
