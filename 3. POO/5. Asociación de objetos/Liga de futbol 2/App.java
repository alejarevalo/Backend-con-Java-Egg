/*
 * Para continuar con el sistema de gestión de la liga de fútbol es necesario agregar las siguientes funcionalidades al menú: 

- Eliminar jugador:  Debe permitir seleccionar un jugador para ser eliminado de una lista (tipo array) total de jugadores.
 -Eliminar Equipo:  Debe permitir eliminar un equipo de una lista total de equipos.
 -Seleccionar jugador: Con esta opción, podrás seleccionar un jugador específico para ver o modificar sus detalles. Esto debería llevar a un submenú 
 con las siguientes opciones:

    -- Ver detalles: Muestra el nombre del jugador y el equipo al que está asignado.
    -- Cambiar nombre: Permite al usuario cambiar el nombre del jugador.
    -- Cambiar equipo: Permite al usuario cambiar el equipo al que está asignado el jugador.
    -- Regresar al menú principal.

- Seleccionar equipo: Al elegir esta opción, se debe mostrar la lista de equipos, seleccionar uno y luego mostrar el siguiente submenú con las siguientes opciones:

    -- Ver detalles.
    -- Cambiar nombre: Debes asegurarte que cambie el nombre de la instancia de equipo que pertenece a cada jugador también.
    -- Agregar jugador al equipo: se debe mostrar la lista de jugadores para que el usuario elija a cual asignarle el equipo.
    -- Mostrar jugadores del equipo.
    -- Regresar al menú principal.
 */

import java.util.ArrayList;
import java.util.Scanner;

import models.Equipo;
import models.Jugador;

public class App {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList<>();
    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("""
                \nBienvenido al sistema de gestión de jugadores y equipos.
                1. Crear jugador
                2. Crear equipo
                3. Asignar jugador a equipo
                4. Mostrar lista de jugadores
                5. Mostrar lista de equipos
                6. Eliminar jugador
                7. Eliminar Equipo
                8. Seleccionar jugador***
                9. Seleccionar equipo
                10. Salir
                Escribe una opción:
                """);
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1 -> crearJugador();
                case 2 -> crearEquipo();
                case 3 -> asignarJugadorAEquipo();
                case 4 -> mostrarJugadores();
                case 5 -> mostrarEquipos();
                case 6 -> eliminarJugador();
                case 7 -> eliminarEquipo();
                case 8 -> seleccionarJugador();
                case 9 -> seleccionarEquipo();
                case 10 -> System.out.println("Saliendo del sistema. ¡Adiós!");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 10);
    }

    public static void crearJugador() {
        System.out.println("Ingresa el nombre del jugador:");
        String nombreJugador = sc.nextLine();
        Jugador jugador = new Jugador();
        jugador.setNombre(nombreJugador);

        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles. El jugador no estará asignado a ningún equipo.");
            jugador.setEquipo(null);
        } else {
            System.out.println("Selecciona un equipo para el jugador:");
            mostrarEquipos();
            int equipoSeleccionado = sc.nextInt() - 1;
            sc.nextLine();
            if (equipoSeleccionado >= 0 && equipoSeleccionado < equipos.size()) {
                jugador.setEquipo(equipos.get(equipoSeleccionado));
            } else {
                System.out.println("Selección inválida. El jugador no estará asignado a ningún equipo.");
                jugador.setEquipo(null);
            }
        }
        jugadores.add(jugador);
        System.out.println("Jugador creado exitosamente.");
    }

    public static void crearEquipo() {
        System.out.println("Ingresa el nombre del equipo:");
        String nombreEquipo = sc.nextLine();
        Equipo equipo = new Equipo(nombreEquipo);
        equipos.add(equipo);
        System.out.println("Equipo creado exitosamente.");
    }

    public static void asignarJugadorAEquipo() {
        if (jugadores.isEmpty() || equipos.isEmpty()) {
            System.out.println("Debe haber al menos un jugador y un equipo para realizar esta acción.");
            return;
        }

        System.out.println("Selecciona un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorSeleccionado = sc.nextInt() - 1;
        sc.nextLine();

        System.out.println("Selecciona un equipo:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoSeleccionado = sc.nextInt() - 1;
        sc.nextLine();

        if (jugadorSeleccionado >= 0 && jugadorSeleccionado < jugadores.size() &&
            equipoSeleccionado >= 0 && equipoSeleccionado < equipos.size()) {
            jugadores.get(jugadorSeleccionado).setEquipo(equipos.get(equipoSeleccionado));
            System.out.println("Jugador asignado al equipo exitosamente.");
        } else {
            System.out.println("Selección inválida. No se realizó la asignación.");
        }
    }

    public static void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            System.out.println("Lista de jugadores:");
            for (Jugador jugador : jugadores) {
                System.out.println("Nombre: " + jugador.getNombre() +
                                   ", Equipo: " + (jugador.getEquipo() != null ? jugador.getEquipo().getNombre() : "Sin equipo"));
            }
        }
    }

    public static void mostrarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
        } else {
            System.out.println("Lista de equipos:");
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
            }
        }
    }

    public static void eliminarJugador(){
        System.out.println("Selecciona un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorSeleccionado = sc.nextInt() - 1;
        sc.nextLine();
        if (jugadorSeleccionado >= 0 && jugadorSeleccionado < jugadores.size()) {
            jugadores.remove(jugadorSeleccionado);
            System.out.println("Jugador eliminado exitosamente.");
        } else {
            System.out.println("Selección inválida. No se eliminó ningún jugador.");
        }

    }

    public static void eliminarEquipo() {
        System.out.println("Selecciona un equipo:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoSeleccionado = sc.nextInt() - 1;
        sc.nextLine();
        if ( equipoSeleccionado >= 0 && equipoSeleccionado < equipos.size()) {
            equipos.remove(equipoSeleccionado);
            System.out.println("Equipo eliminado exitosamente.");
        } else {
            System.out.println("Selección inválida. No se realizó la asignación.");
        }
    }

    public static void seleccionarJugador(){
        int opcion;
        System.out.println("Selecciona un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorSeleccionado = sc.nextInt() - 1;
        sc.nextLine();
        if (jugadorSeleccionado >= 0 && jugadorSeleccionado < jugadores.size()) {
            do {
                System.out.println("""
                    \nEscoge la opción que deseas realizar con el jugador.
                    1. Ver detalles
                    2. Cambiar nombre
                    3. Cambiar equipo
                    4. Regresar al menú principal
                    Escribe una opción:
                    """);
                opcion = sc.nextInt();
                sc.nextLine(); // Limpia el buffer
    
                switch (opcion) {
                    case 1 -> {
                        jugadores.get(jugadorSeleccionado).mostrarDetalles();
                        
                    }
                    case 2 -> {
                        System.out.println("Ingresa el nuevo nombre del jugador:");
                        String nuevoNombre = sc.nextLine();
                        jugadores.get(jugadorSeleccionado).setNombre(nuevoNombre);                        
                    }
                    case 3 -> {
                        System.out.println("Ingresa el nuevo equipo del jugador:");
                        String nuevoEquipo = sc.nextLine().trim();
                        Jugador jugadorIndicado = jugadores.get(jugadorSeleccionado);
                        if (jugadorIndicado.getEquipo()==null){
                            System.out.println("El jugador no contaba con ningún equipo.");
                            jugadorIndicado.setEquipo(new Equipo(nuevoEquipo));
                            System.out.println("Se le agregó el nuevo equipo exitosamente.");
                        }else{
                            jugadorIndicado.getEquipo().setNombre(nuevoEquipo);
                            System.out.println("Se le cambió el equipo exitosamente.");
                        }
                    } 
                    case 4 ->  System.out.println("Regresando al menú principal.");
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion != 4);
        } else {
            System.out.println("Selección inválida. No se eliminó ningún jugador.");
        }      
            
    }

    public static void seleccionarEquipo(){
        int opcion;
        System.out.println("Selecciona un equipo:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoSeleccionado = sc.nextInt() - 1;
        sc.nextLine();
        if ( equipoSeleccionado >= 0 && equipoSeleccionado < equipos.size()) {
            do {
                System.out.println("""
                    \nEscoge la opción que deseas realizar con el equipo.
                    1. Ver detalles
                    2. Cambiar nombre
                    3. Agregar jugador al equipo 
                    4. Mostrar jugadores del equipo
                    5. Regresar al menu principal
                    Escribe una opción:
                    """);
                opcion = sc.nextInt();
                sc.nextLine(); // Limpia el buffer
    
                switch (opcion) {
                    case 1 -> {
                        equipos.get(equipoSeleccionado).mostrarDetalles();//***** */
                        
                    }
                    case 2 -> {
                        System.out.println("Ingresa el nuevo nombre del equipo:"); /*Debes cambiar el nombre de la instancia de equipo que pertenece a cada jugador también. */
                        String nuevoNombre = sc.nextLine();
                        Equipo nuevoEquipo = equipos.get(equipoSeleccionado);
                        nuevoEquipo.setNombre(nuevoNombre); 
                        System.out.println("El equipo ahora se llama: " + nuevoNombre);                       
                    }
                    case 3 -> {

                        System.out.println("Selecciona el jugador al que vas agregarle el equipo:");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
                        
                        int jugadorSeleccionado = sc.nextInt() - 1;
                        sc.nextLine();
                        Jugador jugadorObjeto = jugadores.get(jugadorSeleccionado);
                        Equipo equipoObjeto = equipos.get(equipoSeleccionado);
                        jugadorObjeto.setEquipo(equipoObjeto);
                        System.out.println("El nuevo equipo de "+jugadorObjeto.getNombre()+" es: "+jugadorObjeto.getEquipo());
                        } // ERROR Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
                    } 
                    case 4 ->  {
                          // Validar la selección del equipo
                        if (equipoSeleccionado > 0 && equipoSeleccionado <= equipos.size()) {
                            Equipo equipoObjeto = equipos.get(equipoSeleccionado - 1);
                            System.out.println("Jugadores del equipo " + equipoObjeto.getNombre() + ":");

                            // Mostrar jugadores del equipo seleccionado
                            boolean hayJugadores = false;
                            for (Jugador jugador : jugadores) {
                                if (jugador.getEquipo() != null && jugador.getEquipo().equals(equipoObjeto)) {
                                    System.out.println("- " + jugador.getNombre());
                                    hayJugadores = true;
                                }
                            }

                            if (!hayJugadores) {
                                System.out.println("No hay jugadores en este equipo.");
                            }
                        } else {
                            System.out.println("Selección inválida.");
                        }

                    }
                    case 5 -> System.out.println("Regresando al menú principal.");
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion != 5);

        } else {
            System.out.println("Selección inválida. No se realizó la asignación.");
        }
    }


}