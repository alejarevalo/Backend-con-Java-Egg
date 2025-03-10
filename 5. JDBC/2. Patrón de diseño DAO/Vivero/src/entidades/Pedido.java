package entidades;

import java.time.*;

public class Pedido {
    private int id_pedido;
    private int codigo_pedido;
    private LocalDate fecha_pedido;
    private LocalDate fecha_esperada;
    private String estado;
    private String comentarios;
    public int id_cliente;

    public Pedido() {
    }

    public Pedido(int id_pedido, int codigo_pedido, LocalDate fecha_pedido, LocalDate fecha_esperada, String estado,
            String comentarios, int id_cliente) {
        super();
    }

    public Pedido(int codigo_pedido, LocalDate fecha_pedido, LocalDate fecha_esperada, String estado,
            String comentarios, int id_cliente) {
        this.codigo_pedido = codigo_pedido;
        this.fecha_pedido = fecha_pedido;
        this.fecha_esperada = fecha_esperada;
        this.estado = estado;
        this.comentarios = comentarios;
        this.id_cliente = id_cliente;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public LocalDate getFecha_esperada() {
        return fecha_esperada;
    }

    public void setFecha_esperada(LocalDate fecha_esperada) {
        this.fecha_esperada = fecha_esperada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Pedido [id_pedido=" + id_pedido + ", codigo_pedido=" + codigo_pedido + ", fecha_pedido=" + fecha_pedido
                + ", fecha_esperada=" + fecha_esperada + ", estado=" + estado + ", comentarios=" + comentarios
                + ", id_cliente=" + id_cliente + "]";
    }


}
