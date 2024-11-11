/*Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena 
y utiliza Character.isWhitespace() para contar el número de espacios en blanco en la cadena. 
Muestra el recuento al usuario. */
import java.util.Scanner;

public class BlanksCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int centinel  = 0;
        try {
            System.out.println("Ingresa una cadena para contarle los espacios:");
            input = sc.nextLine();
            for (int i = 0; i < input.length();i++){
                if (Character.isWhitespace(input.charAt(i))){//se recorre cada letra y si es un espacio
                    centinel++; //entonces crece el contador
                }
            } 
            System.out.printf("Hay un total de %d espacios en blanco en tu cadena.", centinel);

        }catch (Exception e){
            System.out.println("Ocurrió un error. "+e.getMessage());
        }
        sc.close();
    }
}
