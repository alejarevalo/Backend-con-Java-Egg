import java.util.Scanner;
/*Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el 
nombre completo utilizando el método concat() de la clase String. */
public class ConcatenarPalabras {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();
        String nombreCompleto = nombre.concat(" "+apellido); //se concatena

        System.out.println("Su nombre y apellido es: "+nombreCompleto); 
        sc.close();
    }
}
