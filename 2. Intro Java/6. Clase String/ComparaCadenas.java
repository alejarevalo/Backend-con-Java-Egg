import java.util.Scanner;

public class ComparaCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa palabra 1:");
        String cadena1 = sc.nextLine();
        System.out.println("Ingresa palabra 2:");
        String cadena2 = sc.nextLine();

        System.out.println(cadena1.equals(cadena2) ? "Las cadenas son iguales" : "Las cadenas son diferentes");

        sc.close();
    }
}
