import java.util.Scanner;
import java.util.Arrays;

public class PrimosPedidos {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese la cantidad de primos:");
            int cantidad = sc.nextInt();
            int[] primos = new int[cantidad];
            
            // Inicializar con el primer número primo conocido, 2
            primos[0] = 2;
            int encontrados = 1; // Ya tenemos 1 número primo
            int i = 3; // Comenzamos a buscar desde el siguiente número impar
            
            while (encontrados < cantidad) {
                int divisores = 0;
                
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        divisores++;
                        break; // Salimos del bucle si encontramos un divisor
                    }
                }
                
                if (divisores == 0) {
                    primos[encontrados++] = i; // Guardamos el primo y avanzamos el contador
                }
                
                i += 2; // Avanzamos al siguiente número impar
            }
            
            System.out.println(Arrays.toString(primos));
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }    
}
