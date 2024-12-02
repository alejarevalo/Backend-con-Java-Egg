package models;

public class Equipo {
    private String nombre;

    public Equipo() {}

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles:");
        System.out.println("Nombre: " + nombre);       
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Son el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // No es de la misma clase

        Equipo equipo = (Equipo) obj; // Casteo
        return nombre != null && nombre.equalsIgnoreCase(equipo.nombre); // Compara los nombres        
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.toLowerCase().hashCode() : 0; // Usa el nombre como base para el hash
    }

    @Override
    public String toString() {
        return nombre; // Sobrescribe el método toString para mostrar el nombre del equipo
    }
}

