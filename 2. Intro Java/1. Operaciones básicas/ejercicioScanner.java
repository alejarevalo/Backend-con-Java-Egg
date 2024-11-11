import java.util.Scanner;

public class ejercicioScanner {
    /*Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..

Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..

Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”. */
    public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);

    System.out.println("Ingresa tu nombre");
    String miNombre  = miScanner.nextLine();
    
    System.out.println("Ingresa tu edad");
    int miEdad = miScanner.nextInt();
    
    System.out.println("Su nombre es "+miNombre+" y su edad es "+miEdad);
    miScanner.close();
    }
}
