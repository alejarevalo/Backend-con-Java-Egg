import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * Pasos a seguir:
    - Inicializa un ArrayList de tipo Integer para almacenar los números enteros.
    - Implementa un bucle que solicite al usuario ingresar números enteros uno por uno. 
    Puedes usar un bucle while o for que pregunte al usuario si desea agregar un número en cada iteración.
    - En cada iteración del bucle, verifica que el número ingresado esté dentro del rango del 1 al 10 y 
    agrégalo al ArrayList utilizando el método add. Continúa solicitando al usuario que ingrese números 
    hasta que decida no agregar más.
    - Después de que el usuario haya ingresado todos los números, utiliza el método sort para ordenar 
    la lista de números de forma descendente.
    - Imprime por pantalla la lista ordenada tanto en orden ascendente como descendente.
 */
public class App{
    static ArrayList<Integer> miArray = new ArrayList<Integer>();
    static ArrayList<Integer> otroArray = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        int opcion;        
        do{
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Ingresa una nota del 1 al 10.");
            System.out.println("2. Mostrar números ordenados de mayor a menor.");
            System.out.println("3. Mostrar números ordenados de menor a mayor.");
            System.out.println("4. Salir");
            System.out.println("Selecciona tu opción:");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa un número:");
                    Integer numero = Integer.parseInt(sc.nextLine());
                    if(numero >= 1 && numero <= 10) {
                        miArray.add(numero);
                        System.out.println("Nota ingresada.");
                    }else System.out.println("Número fuera de rango.");
                    
                }
                case 2 -> {
                    Collections.sort(miArray);// esto es por referencia o por valor?
                    Collections.reverse(miArray);// esto es por referencia o por valor?
                    System.out.println(miArray.toString());                    
                }
                case 3 -> {
                    Collections.sort(miArray);
                    System.out.println(miArray.toString());   
                }
                case 4 -> flag = false;
                default -> System.out.println("Ingresa una opción válida");
            }
        }while(flag);
    }
}