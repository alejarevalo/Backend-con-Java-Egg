/*Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. 
La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta. */
import java.util.Scanner;

public class VerifiqueContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        do {
            System.out.println("Ingrese la contrasena");
            respuesta = sc.nextLine();

        } while (!respuesta.equals("secreto")); //para hacer "diferente a" con equals, se pone un "!" al principio
        System.out.println("Contraseña correcta");
        sc.close();
    }// main
}// class
