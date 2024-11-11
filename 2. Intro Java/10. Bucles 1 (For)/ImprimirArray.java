/*Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada.
 El tamaño, tipo de datos y la información a contener pueden ser de tu elección. */

public class ImprimirArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // for (int i = 0; i < array.length; i++){
        //     System.out.println("array ["+i+"] = "+array[i]);       
        // }
        for  (int elemento : array) {
            System.out.println(elemento);
            }

    }//main end        
}//class end