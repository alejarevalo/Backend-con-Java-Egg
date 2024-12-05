/*Crea un programa principal que te permita realizar las siguientes acciones:
- Agregar libros ingresando título, autor y número de ISBN.
- Eliminar libros ingresando un número de ISBN.
- Mostrar el catálogo actual de tu librería. */

import java.util.Scanner;

import modelos.Libreria;
import modelos.Libro;

public class App{
    
    static boolean flag = true;
    static Scanner sc = new Scanner(System.in);
    static Libreria libros = new Libreria();
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("""
                    Bienvenido a Lista de Invitados
                    1. Agrega un libro
                    2. Elimina un libro
                    3. Mostrar el catálogo actual de tu librería
                    4. Salir
                    Escoge una opción: 
                    """);
            opcion = Integer.parseInt(sc.nextLine()); //limpia el búffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del libro: ");
                    String nombreLibro = sc.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String autorLibro = sc.nextLine();
                    System.out.println("Ingresa el código de ISBN del libro (solo números): ");
                    Integer isbnLibro = Integer.parseInt(sc.nextLine());
                    Libro libro = new Libro(nombreLibro, autorLibro, isbnLibro);
                    libros.agregarLibro(libro);
                    
                }
                case 2 -> {
                    System.out.println("Ingrese el código de ISBN del libro a eliminar: ");
                    Integer isbnLibro = Integer.parseInt(sc.nextLine());
                    libros.eliminarLibroPorIsbn(isbnLibro);
                }
                case 3 -> libros.mostrarCatalogo();
                case 4 -> {
                    System.out.println("Gracias por usar el programa.");
                    flag = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }while (flag);
        sc.close();
    }
}