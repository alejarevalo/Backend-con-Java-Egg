package com.egg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private int idEmpleado;

    @Column(name="apellido")
    private String apellido;

    @Column(name="codigo_empleado")
    private int codigoEmpleado;

    @Column(name="email")
    private String email;

    @Column(name="extension")
    private String extension;

    @Column(name="id_jefe")
    private int idJefe;

    @Column(name="nombre")
    private String nombre;

    @Column(name="puesto")
    private String puesto;

    @ManyToOne
    @JoinColumn(name="id_oficina")
    private Oficina oficina;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String apellido, int codigoEmpleado, String email, String extension, int idJefe,
            String nombre, String puesto, Oficina oficina) {
        this.idEmpleado = idEmpleado;
        this.apellido = apellido;
        this.codigoEmpleado = codigoEmpleado;
        this.email = email;
        this.extension = extension;
        this.idJefe = idJefe;
        this.nombre = nombre;
        this.puesto = puesto;
        this.oficina = oficina;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    
}
