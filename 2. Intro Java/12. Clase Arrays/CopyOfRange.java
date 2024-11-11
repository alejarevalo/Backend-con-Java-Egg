/*Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. 
Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, 
copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando 
el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial 
es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. 
Finalmente, imprime el nuevo arreglo por consola. */
import java.util.Arrays;
import java.util.Scanner;

public class CopyOfRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {2,5,6,5,8,5};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Posición %d valor %d\n", i, arreglo[i]);
        }
        System.out.println("Ingrese el índice inicial: ");
        int inicio = sc.nextInt();
        System.out.println("Ingrese el índice final: ");
        int fin = sc.nextInt();

        int[] copiaDeParte = Arrays.copyOfRange(arreglo,inicio,fin+1);

        for (int i = 0; i < copiaDeParte.length; i++) {
            System.out.printf("[%d]",  copiaDeParte[i]);
        }
        sc.close();

    }//main
}//class
/*Otra manera
 * nt[] arr = new int[10];
for (int i=0; i <= arr.length-1; i++){
arr[i] = (int)(Math.random()*100)+1;
System.out.println("El arreglo en la posición " + i + " contiene el número " + arr[i]);
}
Scanner input = new Scanner(System.in);
System.out.println("Ingrese dos indices");
int indice1 = input.nextInt();
int indice2 = input.nextInt();

if (indice1<indice2) {
System.out.println("Los numeros entre esos indices son:"+Arrays.toString(Arrays.copyOfRange(arr,indice1,indice2+1)));
 */