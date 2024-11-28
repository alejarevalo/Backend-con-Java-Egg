package modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    static ArrayList<Libro> libros = new ArrayList<Libro>();
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        iniciarBiblioteca();
        Persona persona1 = new Persona("Juan", "Perez");
        Libro libro1 = new Libro("Cicatrices que aún duelen", "Alba", 120);
        agregarLibro(libro1);

        do {
            System.out.println("""
                ¿Qué deseas hacer?
                1. Agregar libro
                2. Mostrar libros
                3. Tomar prestado libro
                4. Devolver libro
                5. Salir
                """);
            int option = keyIn.nextInt();
            keyIn.nextLine();//limpiando búffer

            switch (option) {
                case 1-> agregarLibro();
                case 2-> mostrarLibros();
                case 3-> {
                    System.out.println("Gracias por usar el sistema.");
                }                    
                default-> {System.out.println("Opción no valida");
                break;
                }                   
            }//switch end
        }while (true);
    }

    public static String[][] sciFiBooks = {
        { "Dune", "Herbert", "Frank", "Chilton Books", "1965", "412", "4.5" },
        { "1984", "Orwell", "George", "Secker & Warburg", "1949", "328", "4.2" },
        { "Stranger in a Strange Land", "Heinlein", "Robert A.", "G.P. Putnam's Sons", "1961", "408", "4.0" },
        { "The Left Hand of Darkness", "Le Guin", "Ursula K.", "Ace Books", "1969", "304", "4.1" },
        { "Neuromancer", "Gibson", "William", "Ace Books", "1984", "271", "3.9" },
        { "Ender's Game", "Card", "Orson Scott", "Tor Books", "1985", "324", "4.3" },
        { "The War of the Worlds", "Wells", "H.G.", "William Heinemann", "1898", "288", "3.8" },
        { "Brave New World", "Huxley", "Aldous", "Chatto & Windus", "1932", "311", "3.9" },
        { "The Time Machine", "Wells", "H.G.", "William Heinemann", "1895", "118", "3.8" },
        { "The Handmaid's Tale", "Atwood", "Margaret", "McClelland and Stewart", "1985", "311", "4.1" },
    };

    public static void iniciarBiblioteca() {
            Biblioteca biblioteca = new Biblioteca();
            for (String[] book : sciFiBooks) {        
            String titulo = book[0];
            String autor = (book[1] + " " + book[2]);
            int numeroDePaginas = Integer.parseInt(book[5]);
            Libro libro = new Libro();
            libros.add(libro);
            }
    }

    public static void agregarLibro(){  
        Libro libro = new Libro();
        System.out.println ("Ingresa el título del libro -->");
        libro.setTitulo(keyIn.nextLine());
        System.out.println ("Ingresa el nombre del autor -->");
        libro.setAutor(keyIn.nextLine());
        System.out.println ("Ingresa el número de páginas -->");
        libro.setNumeroDePaginas(Integer.parseInt(keyIn.nextLine()));
        libros.add(libro);
        keyIn.close();
    }

    
    public static void agregarLibro(Libro libro) {
        for (Libro libr : libros) {
            if(libr.getTitulo().equals(libro.getTitulo()));{
                System.out.println("El libro ya existe");
                return;
            }          
        }        
       libros.add(libro);
    }

    public static void mostrarLibros(){
        int indice =1;
        for (Libro libro : libros) {
            System.out.println(indice + " " +libro);
            indice++;
        }
    }

    public static void prestarLibro(Persona persona){
        System.out.println("Seleccione el numero del libro que desea pedir prestado");
        mostrarLibrosDisponibles();
        int index = Integer.parseInt(keyIn.nextLine());
        if (index > 0 && index < libros.size()){
            libros.get(index-1).setEstaPrestado(true);
            persona.getLibrosUsuario().add(libros.get(index - 1));
            return;
        }
        System.out.println("Rango inválido");

    }
    
    public static void mostrarLibrosDisponibles(){
        int indice =1;        
        for (Libro libro : libros) {
            if(!libro.isEstaPrestado()){
            System.out.println(indice + " " +libro);
            indice++;
            }
        }
    }

}


