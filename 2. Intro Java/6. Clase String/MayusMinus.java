import java.util.Scanner;

public class MayusMinus {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese una frase:");
    String frase = scan.nextLine();
    
    System.out.println("Su frase ingresada: " + frase);
    System.out.println("Su frase en mayusculas: " + frase.toUpperCase());
    System.out.println("Su frase en minusculas: " + frase.toLowerCase());
    
    scan.close();
    }
    
    }
