/*1)Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". 
Invocar dicho método desde el método main para ver el mensaje por consola
2)Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje 
"Me llamo [nombre] y tengo [edad] años". */

import java.util.Scanner;

public class ImprimirNombreyEdad{ 

    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
       
        String nombre = ingresarNombre(sc);
        int edad = ingresarEdad(sc);
        imprimeNombreYEdad(nombre, edad);
    }//main

    public static String ingresarNombre(Scanner sc){
        System.out.println("Ingresa tu nombre");
        return sc.nextLine();
    }

    public static int ingresarEdad(Scanner sc) {        
        System.out.println("Ingresa tu edad");
       return sc.nextInt();        
    }

    public static void imprimeNombreYEdad(String nombre, int edad){
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
    
    // O crear un método con retorno de variable en vez de un procedimiento
    // public static  String imprimeNombreYEdad(String nombre, int edad) {
    //     return  "Me llamo " + nombre + " y tengo " + edad + " años.";
    // }

}//class