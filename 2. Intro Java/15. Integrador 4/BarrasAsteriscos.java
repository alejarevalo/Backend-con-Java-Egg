/* Creando un gráfico de barras:
Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de 
gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, donde cada asterisco representa 
una unidad en la escala. A modo de ejemplo:
2**
5*****
1*
4**** 
 */
import java.util.Scanner;

public class BarrasAsteriscos {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[4];
        try{             
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingrese un numero entre 1 y 20: ");
                numeros[i] = sc.nextInt();
                while  (numeros[i] < 1 || numeros[i] > 20) {
                    System.out.println("Solo se permite el rango entre 1 y 20. Ingréselo nuevamente: ");
                    numeros[i] = sc.nextInt();
                }
            }
            sc.close();
            for (int i = 0; i  < numeros.length; i++) {
                System.out.print(numeros[i]+": ");
                for (int j = 1; j <= numeros[i]; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (Exception e) {
            System.out.println("Error al ingresar el número: "+e.getMessage());
        }
    }//main
}//class
