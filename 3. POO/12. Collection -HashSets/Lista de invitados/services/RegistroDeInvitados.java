package services;

import java.util.HashSet;

/* - Crea una clase llamada RegistroDeInvitados que contenga un HashSet para almacenar los nombres de los invitados.
- Implementa un método llamado agregarInvitado que reciba como parámetro el nombre de un invitado y lo agregue al HashSet.
- Implementa un método llamado eliminarInvitado que reciba como parámetro el nombre de un invitado y lo elimine del HashSet, 
en caso de que exista.
- Implementa un método llamado mostrarInvitados que imprima por pantalla la lista de invitados.
 */
public class RegistroDeInvitados {
    private HashSet<String> invitados = new HashSet<>();

    public void agregarInvitado(String nombre) {
        invitados.add(nombre);
    }

    public void eliminarInvitado(String nombre) {
        if (invitados.contains(nombre)){
            invitados.remove(nombre);
        }        
    }    

    public void mostrarInvitado() {
        if (!invitados.isEmpty()){
            System.out.println(invitados);
        }else {
            System.out.println("No hay invitados");
        }
    }

}