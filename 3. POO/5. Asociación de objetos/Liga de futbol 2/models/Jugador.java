package models;

public class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador() {}

    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles:");
        System.out.println("Nombre: " + nombre);
        if (equipo != null) System.out.println("Equipo: " + equipo.getNombre());
        else System.out.println("Equipo: Sin equipo");        
    }

}
