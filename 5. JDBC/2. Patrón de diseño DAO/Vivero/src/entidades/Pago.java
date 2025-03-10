package entidades;

import java.time.LocalDate;

public class Pago {
    private int id_pago;
    private int id_cliente;
    private String forma_pago;
    private String id_transaccion;
    private LocalDate fecha_pago;
    private double total;

    public Pago() {
    }

    public Pago(int id_pago, int id_cliente, String forma_pago, String id_transaccion, LocalDate fecha_pago,
            double total) {
        this.id_pago = id_pago;
        this.id_cliente = id_cliente;
        this.forma_pago = forma_pago;
        this.id_transaccion = id_transaccion;
        this.fecha_pago = fecha_pago;
        this.total = total;
    }

    public Pago(int id_cliente, String forma_pago, String id_transaccion, LocalDate fecha_pago, double total) {
        this.id_cliente = id_cliente;
        this.forma_pago = forma_pago;
        this.id_transaccion = id_transaccion;
        this.fecha_pago = fecha_pago;
        this.total = total;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(String id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pago [id_pago=" + id_pago + ", id_cliente=" + id_cliente + ", forma_pago=" + forma_pago
                + ", id_transaccion=" + id_transaccion + ", fecha_pago=" + fecha_pago + ", total=" + total + "]";
    }

    

    
}
