/* * Proyecto para gestionar los jugadores de una liga de fútbol. Deberás manejar equipos y jugadores con una 
relación de agregación, permitiendo al usuario interactuar con ellos a través de un menú en consola.
Para esto deberás generar una clase “Jugador” y una “Equipo”. Para relacionar ambas clases vamos a utilizar una agregación, recomendamos que el jugador 
tenga un atributo del tipo “Equipo” para facilitar la resolución. Con esto, el menú deberá permitir realizar las siguientes acciones: 
- 1. Crear jugador: Esta opción te permitirá crear un nuevo jugador. Deberás pedir al usuario el nombre del jugador y mostrar la lista de equipos disponibles para 
que elija uno, si no hay equipos creados entonces debería mostrar un mensaje que diga que no hay equipos disponibles y setear null.
- 2. Crear equipo: Esta opción te permitirá crear un nuevo equipo. Deberás pedir al usuario el nombre del equipo.
- 3. Asignar jugador a equipo: Con esta opción, podrás asignar un jugador existente a un equipo existente. Deberás permitir al usuario seleccionar 
de la lista de jugadores y equipos existentes.
- 4. Mostrar lista de jugadores: Esta opción mostrará una lista de todos los jugadores creados, junto con el nombre del equipo al que están asignados, si corresponde.
- 5. Mostrar lista de equipos: Esta opción mostrará una lista de todos los equipos creados.
- 6. Salir: Esta opción termina la ejecución del programa.
 */

import java.util.ArrayList;
import java.util.Scanner;

import Modelos.Equipo;
import Modelos.Jugador;

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
                6. Salir
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
                case 6 -> System.out.println("Saliendo del sistema. ¡Adiós!");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 6);
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
}