/*Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar 
de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta que el 
usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle. */

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número de la tabla de multiplicar. Para salir, ingresa 0:");
        int numero = sc.nextInt();
        while (numero != 0){
            for  (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d =  %d\n", numero, i, (numero * i));
            }//for
            System.out.println("Ingresa el número de la tabla de multiplicar. Para salir, ingresa 0:");
            numero = sc.nextInt();
        }//while
        sc.close();
    }//main
}//class

/* Otra forma
Scanner scanner = new Scanner(System.in);
int cont, num;
do {
 num = scanner.nextInt();
 cont=1;
  while (cont<=12) {
  System.out.println( num + " x " + cont + "=" + (num*cont) );
  cont++;
  }
  System.out.println("----------------------------");
} while (num!=0); */