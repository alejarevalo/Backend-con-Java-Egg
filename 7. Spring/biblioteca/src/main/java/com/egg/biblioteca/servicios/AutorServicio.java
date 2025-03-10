package com.egg.biblioteca.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;

import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {
    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional // ya que este metodo alterará el estado de la base de datos
    public void crearAutor(String nombre) throws MiException {
        validar(nombre);
        Autor autor = new Autor(); // instancio un objeto del tipo Autor
        autor.setNombre(nombre);
        autorRepositorio.save(autor);
    }

    @Transactional(readOnly=true)
    public List<Autor> listarAutores(){
        List<Autor> autores = new ArrayList<>();
        autores = autorRepositorio.findAll();
        return autores;
    }

    @Transactional
    public void modificarAutor(String nombre, UUID id) throws MiException {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        validar(nombre);
        if (respuesta.isPresent()){
            Autor autor = respuesta.get();

            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }
    }

    private void validar(String nombre)throws MiException{
        if (nombre.isEmpty() || nombre == null){
            throw new MiException("El nombre del autor no puede ser nulo o estar vacío");
        }
    }

    @Transactional(readOnly = true)
    public Autor getOne(UUID id){
        
        /*Según la guia: Utiliza el repositorio para obtener una referencia de la entidad autor correspondiente al id dado, sin cargar completamente 
        el objeto de la base de datos. Este método es un reemplazo para el antiguo getOne y es más eficiente en términos de rendimiento. */
        //return autorRepositorio.getReferenceById(id);

        //método utilizado por Lu:
        return autorRepositorio.findById(id).orElse(null);
    }

}
