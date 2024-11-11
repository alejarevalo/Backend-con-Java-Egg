/*Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
1. Comprar producto.
2. Realizar devolución.
3. Ver mis pedidos.
4. Preguntas frecuentes.
5. Salir.
Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija la
opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra un 
mensaje que indique qué opción eligió el usuario. */
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
        Ingrese una opcion: 
        1. Comprar producto.
        2. Realizar devolución.
        3. Ver mis pedidos.
        4. Preguntas frecuentes.
        5. Salir.""");
        
        int opcion = sc.nextInt();
        sc.close();

        while (opcion != 5) {
            switch (opcion) {
            case 1, 2, 3, 4  -> System.out.printf("Usted eligió la opción %d.", opcion);
            default -> System.out.println("Opción no válida.");                       
            }//switch
        }//while
    }//main
}//class