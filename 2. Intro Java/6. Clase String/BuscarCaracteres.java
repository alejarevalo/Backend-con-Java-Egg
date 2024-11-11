import java.util.Scanner;

public class BuscarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa una palabra: "); 
        String palabra = scanner.nextLine(); // lee la palabra
        System.out.print("Ingresa un carácter: ");  
        char caracter = scanner.next().charAt(0); // Leemos el primer caracter ingresado
        int indice = palabra.indexOf(caracter);  // devuelve el indice del caracter en la palabra

        if (indice != -1) {         // Verificar si el carácter se encuentra en la palabra utilizando indexOf()
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
            System.out.println("La posicion del caracter en la palabra es: " + (indice + 1));
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }
        //otra forma con ternaria:
        //System.out.println(indice != -1 ? "El carácter '" + caracter +"' se encuentra en la posicion "+(palabra.indexOf(caracter)+1): "No se encuentra en la palabra";
        scanner.close();
    }
}
