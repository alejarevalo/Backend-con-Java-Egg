package com.egg.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Integer idAutor;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "alta")
    private boolean alta;

    public Autor() {
    }

    public Autor(Integer idAutor, String nombre, boolean alta) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
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
        return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", alta=" + alta + "]";
    }    
        
}

