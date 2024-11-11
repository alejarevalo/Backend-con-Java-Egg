/*En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())
 y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()).
  Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static Scanner sc = new Scanner(System.in);
    public static int num;
    public static void main(String[] args) {      
        pedirNumero();
        imprimirTablaMultiplicar(num);
    }// main

    public static void pedirNumero(){
        try {
        System.out.println("""
        Bienvenido a tablas de multiplicar.
        
        Ingresa un número entero:
        """);
        num = Integer.parseInt(sc.nextLine());
        }catch (InputMismatchException e) {
            System.out.println("No se ingresó un número: "+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("No ingresaste un número entero: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//pedir num

    public static void imprimirTablaMultiplicar(int num){
        for (int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n", num, i, (num*i));
        }
    } // imprimir tabla


}// class