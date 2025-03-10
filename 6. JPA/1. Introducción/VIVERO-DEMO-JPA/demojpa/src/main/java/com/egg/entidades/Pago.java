package com.egg.entidades;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pago")
    private int idPago;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_pago")
    private Date fechaPago;

    @Column(name="forma_pago")
    private String formaPago;

    @Column(name="id_transaccion")
    private String idTransaccion;

    @Column(name="total")
    private double total;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente pagoCliente;
    
    public Pago() {
    }

    public Pago(int idPago, Date fechaPago, String formaPago, String idTransaccion, double total,
            Cliente pagoCliente) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.total = total;
        this.pagoCliente = pagoCliente;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(Cliente pagoCliente) {
        this.pagoCliente = pagoCliente;
    }    

}
