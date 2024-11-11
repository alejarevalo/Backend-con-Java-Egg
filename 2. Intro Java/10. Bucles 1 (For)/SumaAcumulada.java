/*Escribe un programa que recorra un array de enteros y
calcule la suma acumulada de los elementos, reemplazando cada elemento
por la suma acumulada hasta ese punto.
El tamaño y los números a contener pueden ser de tu elección. */

public class SumaAcumulada {
    public static void main(String[] args) {
        // Inicializamos un array de enteros
        int[] numeros = { 1, 2, 3, 4, 5 };

        // Llamamos al método para calcular la suma acumulada
        calcularSumaAcumulada(numeros);

        // Imprimimos el resultado
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void calcularSumaAcumulada(int[] array) {
        int sumaAcumulada = 0;
        for (int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i];
            array[i] = sumaAcumulada;
        }
    }
}
