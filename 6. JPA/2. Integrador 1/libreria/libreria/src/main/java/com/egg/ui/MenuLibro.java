package com.egg.ui;

import java.util.List;
import java.util.Scanner;

import com.egg.entidades.*;
import com.egg.servicios.*;

public class MenuLibro {
    public static void mostrarMenu(Scanner scanner) throws Exception {
        int opcion;
        boolean flag = true;
        LibroServicio libroServicio = new LibroServicio();
        AutorServicio autorServicio = new AutorServicio();
        EditorialServicio editorialServicio = new EditorialServicio();
        try  {
            do {
                System.out.println("""
                    ----------------------
                    === Menú Libro ===
                    ----------------------
                    1. Crear libro
                    2. Actualizar libro
                    3. Buscar libro
                    4. Eliminar libro
                    5. Listar libros
                    6. Volver al menú principal""");
            System.out.println("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine()); //para limpiar el buffer
                    
            switch (opcion) {
                case 1 -> {
 
                     /*Long isbn, String titulo, Integer anio, Integer ejemplares, Autor autor,
                     Editorial editorial */
                        // Datos del libro
                     System.out.println("Ingresa el ISBN del nuevo libro:");
                     Long isbn = Long.parseLong(scanner.nextLine());
                     System.out.println("Ingresa el título:");
                     String titulo = scanner.nextLine();
                     System.out.println("Ingresa el año de publicación:");
                     Integer anio = Integer.parseInt(scanner.nextLine());
                     System.out.println("Ingresa el número de ejemplares:");
                     Integer ejemplares = Integer.parseInt(scanner.nextLine());

                        //Datos del autor
                     System.out.println("Ingresa el nombre del autor");
                     String nombreAutor = scanner.nextLine();
                     Autor autor;
                     List<Autor> autores = autorServicio.buscarAutorPorNombre(nombreAutor);
                     
                     if (!autores.isEmpty()){ 
                        autor = autores.get(0); //si el autor existe, se le asigna el primero de la lista. 
                        System.out.println("Se le asignará el autor: " + autor.getNombre());
                        if (!autor.isAlta()){ // si está de baja, se actualiza su estado.
                            System.out.println("El autor estaba de baja. Se reactivará");
                            autor.setAlta(true);
                            autorServicio.actualizarAutor(autor);
                            System.out.println("Autor reactivado con éxito");
                        }
                     } else { // Si no existe el autor, crear uno nuevo
                        System.out.println("El autor no está en la base de datos. Se creará un nuevo autor.");
                        autor = autorServicio.crearAutor(nombreAutor);
                    }

                    // Datos de la editorial
                    System.out.println("Ingresa el nombre de la editorial");
                    String nombreEditorial = scanner.nextLine();
                    Editorial editorial;
                    List<Editorial> editoriales = editorialServicio.buscarEditorialPorNombre(nombreEditorial);

                    if (!editoriales.isEmpty()){                        
                       editorial = editoriales.get(0);
                        System.out.println("Se le asignará la editorial: " + editorial.getNombre());   
                        if (!autor.isAlta()){
                            System.out.println("La editorial estaba de baja. Se reactivará.");
                            editorial.setAlta(true);
                            editorialServicio.actualizarEditorial(editorial);
                            System.out.println("Editorial reactivada con éxito.");
                        }
                    } else {
                       System.out.println("La editorial no está en la base de datos. Se creará una nueva editorial.");
                       editorial = editorialServicio.crearEditorial(nombreEditorial);
                    }

                    libroServicio.crearLibro(isbn, titulo, anio, ejemplares, autor, editorial); 
                  // if (autor != null) { 
                    //     System.out.println("Autor creado con éxito.");
                    // } else System.out.println("Error al crear autor.");   

                }
                case 2 -> {
                    System.out.println("Ingresa el id del autor a actualizar");
                    Integer id = Integer.parseInt(scanner.nextLine());
                    Autor autor = autorServicio.buscarAutor(id);
                    if (autor != null) {
                        System.out.println("Ingresa el nuevo nombre del autor");
                        String nombre = scanner.nextLine();
                        autor.setIdAutor(id);
                        autor.setNombre(nombre);
                        autorServicio.actualizarAutor(autor);
                        System.out.println("Autor actualizado con éxito.");
                    }else{
                        System.out.println("Error al actualizar autor"); 
                    }
                }
                case 3 -> {
                    System.out.println("Ingresa el id del autor a buscar.");
                    Integer id = Integer.parseInt(scanner.nextLine());
                    Autor autor = autorServicio.buscarAutor(id);
                    if (autor != null){
                        System.out.println("¡Autor encontrado!");
                        System.out.println(autor);
                    }
                }
                case 4 -> {
                    System.out.println("Ingresa el nombre del autor a buscar.");
                    String nombre = scanner.nextLine();
                    List<Autor> autores = autorServicio.buscarAutorPorNombre(nombre);
                    for (Autor autor : autores) {
                        System.out.println(autor.getNombre());
                    }

                }
                case 5 -> {
                    System.out.println("Ingresa el id del autor a eliminar.");
                    Integer id = Integer.parseInt(scanner.nextLine());
                    autorServicio.darBajaAutor(id);
                }
                case 6 -> {
                    List <Autor> autores = autorServicio.listarTodosLosAutores();
                    if (!autores.isEmpty()){
                        for (Autor autor : autores) {
                            System.out.println(autor);
                        } 
                    } else System.out.println("No hay autores registrados");                 

                }
                case 7 -> {
                    System.out.println("Volviendo al menú principal...");
                    flag = false;
                }
            }
            }while (flag);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void menuBuscarLibro(){
        /* Búsqueda de un libro por ISBN.
        Búsqueda de un libro por Título. 
        Búsqueda de un libro/s por nombre de autor.
        Búsqueda de un libro/s por nombre de Editorial. */
    }
}
