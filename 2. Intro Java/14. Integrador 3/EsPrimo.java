/* Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle 
 * do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. 
 * Finalizar el programa cuando ingrese 0 (cero).
Un número es primo si solo tiene dos divisores: 1 y él mismo. 
 */
import java.util.Scanner;
public class EsPrimo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            boolean isPrime = false;
            int inputNumber;
            do{
                System.out.println("Enter a prime number (0 to exit):");
                inputNumber = sc.nextInt();
                if (inputNumber == 0){
                    break;
                } else if (inputNumber==1) {
                    System.out.printf("Number %d is not a prime number.\n", inputNumber);   
                } else {
                    for (int i = 2; i < Math.sqrt(inputNumber); i++){   // raiz cuadrada del num para reducir la cantidad de divisores que habrá y así optimizarlo.               
                        if (inputNumber % i == 0) isPrime = false;
                        else isPrime = true;                        
                    }
                    if (isPrime) System.out.printf("Number %d is a prime number.\n", inputNumber);
                    else System.out.printf("Number %d is NOT a prime number.\n", inputNumber);
                }                
            }while(inputNumber !=0);    

        } catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }    
}
