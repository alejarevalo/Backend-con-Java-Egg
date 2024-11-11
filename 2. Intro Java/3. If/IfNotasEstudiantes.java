/*En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. 
Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:

Si la puntuación está entre 90 y 100, se mostrará "A".

Si la puntuación está entre 80 y 89, se mostrará "B".

Si la puntuación está entre 70 y 79, se mostrará "C".

Si la puntuación está entre 60 y 69, se mostrará "D".

Si la puntuación es menor a 60, se mostrará "F".

Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), 
el programa debe informar al usuario que el número ingresado está fuera del rango válido.
El programa mostrará en la consola el valor de la calificación obtenida.
Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta. */

import java.util.Scanner;

public class IfNotasEstudiantes {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota del estudiante:");
        int nota = sc.nextInt();
        sc.close();

        if  (nota < 0 && nota > 100) {
            System.out.println("El número ingresado está fuera del rango válido.");
        } else {
            if (nota >= 90 &&nota <= 100) {
                System.out.println("Nota A");
                } else if (nota >= 80 && nota <= 89) {
                    System.out.println("Nota B");
                    } else if (nota >= 70 && nota <= 79) {
                        System.out.println("Nota C");
                        } else if (nota >= 60 && nota <= 69) {
                            System.out.println("Nota D");
                            } else {
                                System.out.println("Nota F");
                            } 
        }
          
        }
    
}
