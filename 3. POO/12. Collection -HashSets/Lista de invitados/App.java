/*Te asignaron desarrollar una aplicación para gestionar el registro de invitados a una fiesta, asegurando que no 
haya duplicados en la lista y permitiendo agregar o eliminar invitados de forma eficiente.
Para cumplir con este objetivo, utilizarás un HashSet en Java. Los pasos a seguir son los siguientes:
- Crea una clase llamada RegistroDeInvitados que contenga un HashSet para almacenar los nombres de los invitados.
- Implementa un método llamado agregarInvitado que reciba como parámetro el nombre de un invitado y lo agregue al HashSet.
- Implementa un método llamado eliminarInvitado que reciba como parámetro el nombre de un invitado y lo elimine del HashSet, 
en caso de que exista.
- Implementa un método llamado mostrarInvitados que imprima por pantalla la lista de invitados.

Además, crea en el programa principal un menú de opciones que permita al usuario llevar a cabo las siguientes acciones,
invocando a sus métodos correspondientes:
- Agregar invitados ingresando su nombre.
- Eliminar invitados ingresando  su nombre.
- Mostrar la lista actual de invitados.

Es importante asegurarse de que el programa no permita duplicados en la lista, ya que el HashSet se 
encargará de mantenerla única.
 */
import java.util.Scanner;

import services.RegistroDeInvitados;
// import java.util.Set;
public class App {
    static boolean flag = true;
    static Scanner sc = new Scanner(System.in);
    static RegistroDeInvitados registroDeInvitados = new RegistroDeInvitados();
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("""
                    Bienvenido a Lista de Invitados
                    1. Agrega un invitado
                    2. Elimina un invitado
                    3. Muestra la lista de invitados
                    4. Salir
                    Escoge una opción: 
                    """);
            opcion = Integer.parseInt(sc.nextLine()); //limpia el búffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del invitado: ");
                    String nombre = sc.nextLine();
                    registroDeInvitados.agregarInvitado(nombre);
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del invitado a eliminar: ");
                    String nombre = sc.nextLine();
                    registroDeInvitados.eliminarInvitado(nombre);
                }
                case 3 -> registroDeInvitados.mostrarInvitado();
                case 4 -> {
                    System.out.println("Gracias por usar el programa.");
                    flag = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }while (flag);
    }
}