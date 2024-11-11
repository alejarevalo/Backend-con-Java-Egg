import java.util.Scanner;
/*Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado de elevar la base al 
exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla. */
public class PotenciaNumeros {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingresa la base");
        int base = sc.nextInt();
        System.out.println("Ingresa el exponente");
        int exponente = sc.nextInt();
        double resultado = Math.pow(base,exponente);
        System.out.println(base + " elevado a la " + exponente + " es " + resultado);
        sc.close();
    }//main end
}//class end
