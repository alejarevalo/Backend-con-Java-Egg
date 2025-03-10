package com.egg;
import java.util.Scanner;
import com.egg.ui.*;

public class Main {
    public static void main(String[] args) {
      menu();
    }
  
    public static void menu() {
      try (Scanner scanner = new Scanner(System.in)) {
        int opcion;
        boolean flag = true;
        do {
          System.out.println("""
              ----------------------
              === Menú Librería ===
              ----------------------
              1. Libro
              2. Autor
              3. Editorial
              4. Salir""");
          System.out.print("Seleccione una opción: ");
          opcion = Integer.parseInt(scanner.nextLine());
          switch (opcion) {
            case 1 -> MenuLibro.mostrarMenu(scanner);
            case 2 -> MenuAutor.mostrarMenu(scanner);
            //case 3 -> //MenuEditorial.mostrarMenu(scanner);
            case 4 -> {System.out.println("Finalizando programa...");
                      flag = false;}            
            default -> System.out.println("Ingrese una opción válida.");
          }
        } while (flag);
      } catch (Exception e) {
        System.out.println("Error en menú principal: " + e);
      }
    }
  }

