/*Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. 
Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego 
ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados 
en la consola. */

import java.util.Arrays;

public class OrdenaDescendente {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {   
         arreglo[i] = (int) (Math.random() * 100-1+1) + 1;
       }
       System.out.println(Arrays.toString(arreglo));

       Arrays.sort(arreglo);
       int[] descendente = new int[10];

       for (int i = 0; i < arreglo.length; i++) {
           descendente[i] = arreglo[arreglo.length - i - 1];
       }
       
       System.out.println(Arrays.toString(descendente));

    }
}
