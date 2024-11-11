import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        boolean compara =  num % 2 == 0;
        String esPar = compara ?  "El numero es par" : "El numero es impar";
        
        // Otra forma de una sola línea:  System.out.println("El número "+ ((num % 2 == 0) ? "es par." : "es impar." );

        System.out.println(esPar);
        
        sc.close();

    }
}
