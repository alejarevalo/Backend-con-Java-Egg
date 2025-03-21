package entidades;

import java.time.LocalDate;

public class Estancia {
    private int id;
    private int id_cliente;
    private int id_casa;
    private String nombre_huesped;
    private LocalDate fecha_desde;
    private LocalDate fecha_hasta;

    public Estancia() {
    }

    public Estancia(int id, int id_cliente, int id_casa, String nombre_huesped, LocalDate fecha_desde,
            LocalDate fecha_hasta) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Estancia(int id_cliente, int id_casa, String nombre_huesped, LocalDate fecha_desde, LocalDate fecha_hasta) {
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public LocalDate getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(LocalDate fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public LocalDate getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(LocalDate fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    @Override
    public String toString() {
        return "Estancias [id=" + id + ", id_cliente=" + id_cliente + ", id_casa=" + id_casa + ", nombre_huesped="
                + nombre_huesped + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + "]";
    }
    
    
    
}
