package com.egg.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "isbn")
    private long isbn;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "ejemplares")
    private Integer ejemplares;

    @Column(name = "alta")
    private boolean alta;

    @ManyToOne()
    @JoinColumn(name = "autor")
    private Autor autor;

    @ManyToOne()
    @JoinColumn(name = "editorial")
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Integer idLibro, long isbn, String titulo, Integer anio, Integer ejemplares, boolean alta, Autor autor,
            Editorial editorial) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro [idLibro=" + idLibro + ", isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio
                + ", ejemplares=" + ejemplares + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial
                + ", getIdLibro()=" + getIdLibro() + ", getIsbn()=" + getIsbn() + ", getTitulo()=" + getTitulo()
                + ", getAnio()=" + getAnio() + ", getEjemplares()=" + getEjemplares() + ", isAlta()=" + isAlta()
                + ", getAutor()=" + getAutor() + ", getClass()=" + getClass() + ", getEditorial()=" + getEditorial()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}