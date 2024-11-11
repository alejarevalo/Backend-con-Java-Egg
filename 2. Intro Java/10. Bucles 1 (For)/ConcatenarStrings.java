/*Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los
 elementos en una sola cadena, separados por espacios, e imprime el resultado por consola. */
public class ConcatenarStrings {
    public static void main(String[] args) {
        String [] arreglo =  {"Hola", "mundo", "esto", "es", "un", "ejemplo"};
        String oracion = "";
        for (int i = 0 ;  i < arreglo.length ; i++) {
            oracion += arreglo[i] + " ";
        }
        System.out.println("Esta es la oración: ");
        System.out.println(""+oracion.trim());


    }
}
