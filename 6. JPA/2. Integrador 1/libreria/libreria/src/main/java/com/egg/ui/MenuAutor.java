package com.egg.ui;

import java.util.List;
import java.util.Scanner;

import com.egg.entidades.Autor;
import com.egg.servicios.*;

public class MenuAutor {
    public static void mostrarMenu(Scanner scanner) throws Exception {
        int opcion;
        boolean flag = true;
        AutorServicio autorServicio = new AutorServicio();
        try  {
            do {
                System.out.println("""
                    ----------------------
                    === Menú Autor ===
                    ----------------------
                    1. Crear autor
                    2. Actualizar autor
                    3. Buscar autor por ID
                    4. Buscar autor por nombre
                    5. Eliminar autor
                    6. Listar autores
                    7. Volver al menú principal""");
            System.out.println("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine()); //para limpiar el buffer
                    
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa el nombre del nuevo autor");
                    String nombre = scanner.nextLine();
                    Autor autor = autorServicio.crearAutor(nombre);
                    if (autor != null) { 
                        System.out.println("Autor creado con éxito.");
                    } else System.out.println("Error al crear autor.");                                        

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
}
