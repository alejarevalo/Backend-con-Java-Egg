import java.util.Random;
import java.util.Scanner;

public class AleatorioYRaiz {

    public static boolean esPrimo(int num) { // función booleana para saber si es primo
        if (num <= 1)
        return false;
        for (int i = 2; i < Math.sqrt(num); i++) { //comprueba si num es divisible entre cada numero del iterador.
            if (num % i == 0)
                return false;
        }//for end
        return true;
    }//fonction esPrimo end

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa un número entre 1 y 30: ");
        int numeroLimite = scanner.nextInt();

        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("El número debe estar entre 1 y 30.");
            return;
        }

        //int numeroAleatorio = random.nextInt(numeroLimite) + 1;  //genera un número aleatorio entre 1 y 30 de otra forma

        int numeroAleatorio = (int)(Math.random()*(numeroLimite-1+1)+1); // hay que (castear) forzar conversion a int 
        //para que aparezca numero sin decimal (?) 
        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        double raizCuadrada = Math.sqrt(numeroAleatorio);

        if (esPrimo(numeroAleatorio)) { //llama a la función, y dependiendo de su resultado, muestra mensajes
            System.out.println("El número " + numeroAleatorio + " es primo.");
        } else {
            System.out.println("El número " + numeroAleatorio + " no es primo.");
        }
        
        System.out.println("Raíz cuadrada de " + numeroAleatorio + ": " + raizCuadrada);
        scanner.close();
    }//Main end
}//Class end
