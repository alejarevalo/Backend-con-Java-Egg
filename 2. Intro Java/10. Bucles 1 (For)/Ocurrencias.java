
/*Contar ocurrencias

Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.

Por ejemplo, si el array contiene la siguiente frase:

a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:

El carácter "d" aparece 2 veces.
Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:

El carácter "z" no aparece en la frase.

 */
import java.util.Scanner;

public class Ocurrencias {
    public static void main(String[] args) {
        // Character[] string = new Character[];

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase de 50 caracteres: ");
        String frase = sc.nextLine();

        while (frase.length() < 50) {
            System.out.print("La frase ingresada debe ser de 50 caracteres. Inténtalo de nuevo: ");
            frase = sc.nextLine();
        }

        char[] fraseMayusculas = frase.toUpperCase().toCharArray(); // mayusculas

        System.out.print("Ingresa un caracter para buscar (case-insensitive): ");
        char caracter = sc.nextLine().charAt(0); // a

        // Convertir a mayúscula
        char caracterMayuscula = Character.toUpperCase(caracter); // A

        int counter = 0;

        for (Character c : fraseMayusculas) { // -> Usando wrapper class de char: Character | int -> Integer
            if (c.equals(caracterMayuscula)) { // ==
                counter++;
            }
        }

        for (char c : frase.toCharArray()) {
            System.out.printf("[%c]", c);
        }

        System.out.printf("\nEl número total de ocurrencias del caracter ingresado (%c) es: %d", caracter, counter);
        sc.close();
    }
}

// Aprender Java abre puertas al desarrollo de software.
