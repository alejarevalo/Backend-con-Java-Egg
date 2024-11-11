import java.util.Arrays;
import java.util.Scanner;

/*El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, 
desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo 
modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero 
con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante. */

public class ArraysFill {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digita el tamaño del arreglo:");
        int size = sc.nextInt();
        System.out.println("Digita el número con que lo vas a llenar;");
        int num =  sc.nextInt();

        int[] arr = new int[size];
        Arrays.fill(arr,num);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
