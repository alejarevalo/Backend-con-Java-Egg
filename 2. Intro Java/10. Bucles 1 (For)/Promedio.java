/*Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. 
Luego, suma todos los elementos del array y calcula su promedio. Finalmente, muestra por consola 
tanto el resultado de la suma como el promedio de los elementos.Te sugerimos implementar el uso de 
la sintaxis de for-each. */
public class Promedio {
    public static void main(String[] args) {
        float[] array = { 2.5f, 2.4f };
        float suma = 0f;
        float promedio = 0f;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        promedio = suma / array.length;
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
