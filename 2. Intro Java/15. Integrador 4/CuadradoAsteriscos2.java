import java.util.Scanner;

public class CuadradoAsteriscos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura del cuadrado");
        int lado = scan.nextInt();
        for (int num = 1; num <= lado; num++) {
            if (num == 1 || num == lado) {
                System.out.println("*".repeat(lado));
            } else {
                System.out.println("*" + " ".repeat(lado - 2) + "*");
            }
        }
        scan.close();
    }
}
