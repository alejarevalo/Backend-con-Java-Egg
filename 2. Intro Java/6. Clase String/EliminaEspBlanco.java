/*Crea un programa que solicite al usuario ingresar una frase con espacios en blanco 
al principio y al final. Utiliza el método trim() de la clase String para eliminar los espacios 
en blanco y luego muestra la frase resultante en pantalla. */
import java.util.Scanner;

public class EliminaEspBlanco {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Ingresa una frase con espacios al principio y al final:");
        String  frase = sc.nextLine();
        String fraseSinEspacios = frase.trim();

        System.out.println(fraseSinEspacios);
        
        sc.close();
    }// main end 
}// class end
