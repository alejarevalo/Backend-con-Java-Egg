/*Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de 
Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.
La serie de Fibonacci comienza de la siguiente manera:
Posición 0: 0
Posición 1: 1
Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3. */
public class Fibonacci {
    public static void main(String[] args) throws Exception{
        int anterior = 0; int actual = 1; int posicion = 0; int resultado = 0;
        while (posicion < 8){
            switch (posicion) {
                case 0 : System.out.print(0+", ");
                posicion++;

                break;
                case 1 : System.out.print(1+", "); 
                posicion++;
               
                break;
            default:
                resultado = anterior + actual;
                anterior = actual;
                actual = resultado;
                if (posicion == 7) System.out.println(resultado);
                else System.out.print(resultado+", ");                           
                posicion++;
            }//switch end
        }//while end
    }//main end    
}//class Fibonacci end
