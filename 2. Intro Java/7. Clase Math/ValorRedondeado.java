/*Escribe un programa que pida al usuario un número decimal y muestra 
en pantalla su valor redondeado utilizando el método round() de la clase Math. */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValorRedondeado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        int redondeado;
        try{
            System.out.println("Ingrese un número decimal: ");
            numero = sc.nextDouble();
            redondeado = (int) Math.round(numero);
            System.out.println("El valor redondeado es: " + redondeado);
        } catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un número decimal.");
        }
        sc.close();        

    }
}
