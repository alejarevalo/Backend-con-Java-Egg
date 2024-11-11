/*Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y se encargue de generar 
la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos números al
usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero. */
import java.util.InputMismatchException;
import  java.util.Scanner;


public class CalculadoraMetodo {
    public static int opcion = 0;
    public static double num1 = 0;
    public static double num2 = 0;
    public static double resultado = 0;
    public static boolean salir = false;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }//main

    public static void menu() {

        try{
            do{            
                System.out.println("Ingrese el primer numero");
                num1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el segundo numero");
                num2 = sc.nextDouble();                
                System.out.println("----------------------------- \n Ingrese que operacion quiere realizar: \n 1. Suma \n 2. Resta \n 3. División \n 4. Multiplicación \n 5. Salir");
                opcion = sc.nextInt();
                sc.nextLine(); 
                switch (opcion) {
                    case 1 -> {
                        resultado =  num1 + num2 ;
                        System.out.println("El resultado de la suma es: " + resultado);
                    }
                    case 2  -> {
                        resultado =  num1 - num2;
                        System.out.println("El resultado de la resta es: " + resultado);
                    }
                    case  3 -> {
                        resultado = num1/num2;
                        if (num2==0){
                            System.out.println("No  se puede dividir por cero");

                        }else {
                            System.out.println("El resultado de la división es: " + resultado); // no funciona
                        }
                    }
                    case 4  -> {
                        resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                    }
                    case  5 -> {
                        System.out.println("Gracias por utilizar la calculadora.");
                        salir = true;          
                    }
                }   //switch            
            } while (salir == false);

        }catch (InputMismatchException e) { 
            System.out.println("No ingresaste un número: "+ e.getMessage()); 
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}//class
