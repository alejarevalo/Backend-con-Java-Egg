package com.egg.entidades;
import jakarta.persistence.*;

@Entity
@Table(name="editoriales")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_editorial")
    private Integer idEditorial;

    @Column(name="nombre")
    private String nombre;

    @Column(name="alta")
    private boolean alta;

    public Editorial() {
    }

    public Editorial(Integer idEditorial, String nombre, boolean alta) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Editorial [idEditorial=" + idEditorial + ", nombre=" + nombre + ", alta=" + alta + "]";
    }

    
    
}
