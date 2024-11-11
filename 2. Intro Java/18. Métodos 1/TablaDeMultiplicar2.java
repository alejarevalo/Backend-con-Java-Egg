/*En esta actividad, vas a crear un programa que solicita al usuario que ingrese 3 números (incluida la lógica en un método llamado pedirNumeros()) 
y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 (incluida la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)).
 Para ello, implementarás un array para almacenar los números ingresados y luego invocarás el método para cada uno de ellos. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaDeMultiplicar2 {
    public static Scanner sc = new Scanner(System.in);
    public static int numeros[] = new int[3];
    public static void main(String[] args) {
        pedirNumeros();
        imprimirTablaMultiplicar(numeros);
    }

    public static void pedirNumeros(){
        System.out.println("Ingresa los 3 numeros");
        try{
            for (int i = 0; i < numeros.length; i++){
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
        }catch (InputMismatchException e) {
            System.out.println("No ingresó un número");            
        }catch (NumberFormatException e){
            System.out.println("Formato de numero invalido");
        }
    }

    public static void imprimirTablaMultiplicar(int[] numeros){
       for (int j = 0; j < numeros.length; j++){
        System.out.println("------");
            for (int i = 1; i <=10; i++){
                System.out.printf("%d x %d = %d\n", numeros[j], i, (numeros[j]*i));
            }            
        }
    } // imprimir tabla

}
