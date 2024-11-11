/*Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente.
*/

import java.util.Scanner;

public class DibujaCuadrado {
     public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("ingrese cantidad de elementos");
        int elementos = lee.nextInt();
        lee.close();
        for (int i = 0; i <= elementos; i++) {
            for (int j = 0; j <= elementos; j++) {
                if ((i == 0) || (i == elementos) || (j == 0) || (j == elementos)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }//columnas for
            System.out.println("");
        }//rows for
    }//main
}//class
