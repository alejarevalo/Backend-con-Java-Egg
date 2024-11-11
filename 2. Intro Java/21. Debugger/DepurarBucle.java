/*1. Crea un programa que use un bucle fori para iterar a través de un array de números y calcular la suma
 de todos los números en el array.
2. Coloca un punto de interrupción dentro del bucle.
3. Ejecuta el programa en modo debug y observa cómo cambian los valores de "suma" y "número" en cada iteración usando el “step over”.
4. Luego vuelve a ejecutar el programa pero utiliza un “breakpoint condicional” para que el programa se detenga en el anteúltimo índice del array */
public class DepurarBucle {
    public static void main(String[] args) {
        int[] array = { 3, 6, 2, 8, 9, 7 };
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println(suma);
    }
}