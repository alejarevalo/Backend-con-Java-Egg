import java.util.Scanner;

public class Integrador2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        System.out.println("Ingresa dos numeros");
        A = sc.nextInt();
        B = sc.nextInt();

        // System.out.println("Ingrese que operacion quiere realizar: \n 1. Suma \n 2. Resta \n 3. Divison \n 4. Multiplicacion");
        
        System.out.println("""
            Ingrese que operacion quiere realizar:
            1. Suma
            2. Resta
            3. Divison
            4. Multiplicacion
            """);
        int C  = sc.nextInt();

        int resultado = (C == 1) ? A+B : (C == 2) ? A-B : (C == 3) ? A*B : (C == 4) ? A/B : null;

        System.out.println("El resultado es: "+resultado);

        sc.close();

    }
}
