import java.util.Scanner;
import java.util.Arrays;

public class PrimosConRaiz {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese la cantidad de primos:");
            int cantidad = sc.nextInt();
            int[] primos = new int[cantidad];
            
            // Comenzamos con el primer número primo conocido
            primos[0] = 2;
            int encontrados = 1; // Ya tenemos el primer número primo
            int i = 3; // Comenzamos desde el siguiente número impar
            
            while (encontrados < cantidad) {
                boolean esPrimo = true;
                
                // Solo probamos divisores hasta la raíz cuadrada de i
                int limite = (int) Math.sqrt(i);
                
                for (int j = 2; j <= limite; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break; // Si encontramos un divisor, salimos del bucle
                    }
                }
                
                if (esPrimo) {
                    primos[encontrados++] = i; // Guardamos el número primo
                }
                
                i += 2; // Avanzamos al siguiente número impar
            }
            
            System.out.println(Arrays.toString(primos));
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }    
}
