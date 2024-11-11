import java.util.Scanner;

public class ReemplazaCaracter {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.print("Ingresa el caracter que quieres cambiar: ");
        char caracter1 = leer.next().charAt(0); // para leer un caracter toca así
        System.out.print("Ingresa el caracter por el que lo quieres reemplazar: ");
        char caracter2 = leer.next().charAt(0);

        System.out.println(frase);
        System.out.println(frase.replace(caracter1, caracter2));

        leer.close();
    }
}
