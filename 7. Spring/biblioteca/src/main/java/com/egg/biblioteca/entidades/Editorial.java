package com.egg.biblioteca.entidades;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // esto ya implica unicidad?
    private UUID id;
    private String nombre;

    public Editorial() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

}
