/*En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita 
ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:
Posición 0: 0
Posición 1: 1
Posición 2: 1
Posición 3: 2
Posición 4: 3
Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario.
 */
import java.util.Scanner;

public class FibonacciMejor {
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        System.out.println("Ingresa la posición de la serie Fibonacci");
        int posicion = lector.nextInt();
        int resultado = 0;
        lector.close();
        if (posicion < 0) {System.out.println("No se puede seleccionar una posición negativa");}
        else{
            switch (posicion) {
                case 0:
                    System.out.printf("Posición  %d: %d", posicion, 0);

                    break;
                case 1:
                    System.out.printf("Posición  %d: %d", posicion, 1);
                
                    break;                    
                default:
                    int anterior = 0;
                    int actual = 1;
                    for (int i = 2;  i <= posicion; i++) {
                        resultado = anterior + actual;
                        anterior = actual;
                        actual = resultado; 
                    }
                    System.out.printf("En la posición %d el valor es: %d", posicion, resultado);

                    break;
            }//switch end
        }//else end
    }//main end
}//class end
