import java.util.Scanner;
/*Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen 
un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena 
que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla. */
public class ExtraerSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Ingrese el índice inicial: ");
        int indiceInicial = scanner.nextInt();
        scanner.nextLine(); // para leer el salto de línea
        System.out.println("Ingrese el índice final: ");
        int indiceFinal = scanner.nextInt();
        scanner.nextLine(); // para leer el salto de línea
        String subcadena = frase.substring(indiceInicial, indiceFinal);
        System.out.println("La subcadena es: " + subcadena);
        scanner.close();
    }
}
