/*Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un
 número aleatorio menor a 100 y luego imprime todos los elementos del array en una única línea. 
 Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola. */
public class ContarPares {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length;  i++) {
            arreglo[i] = (int) (Math.random()*(100-1)+1);            
        }

        for  (int elemento : arreglo) {
            System.out.print(elemento+" ");
        }

        int contador = 0;
        
        for  (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0){
                contador++;
            }
        }

        System.out.printf("\nLa cantidad de números pares es: %d",contador);
    }
}
