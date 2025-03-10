package com.egg.biblioteca.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.EditorialRepositorio;

import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicio {
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {
        validar(nombre);
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorialRepositorio.save(editorial);        
    }

    @Transactional(readOnly=true)
    public List<Editorial> listarEditoriales(){
        List<Editorial> editoriales = new ArrayList<>();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Transactional
    public void modificarEditorial(UUID id, String nombre) throws MiException{
        validar(nombre);
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if(respuesta.isPresent()){
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        }
    }

    public void validar(String nombre) throws MiException{
        if(nombre.isEmpty() || nombre == null){
            throw new MiException("El nombre de la editorial no puede estar vacío o ser nulo");
        }
    }

    @Transactional(readOnly = true)
    public Editorial getOne(UUID id){
        
        /*Según la guia: Utiliza el repositorio para obtener una referencia de la entidad editorial correspondiente al id dado, sin cargar completamente 
        el objeto de la base de datos. Este método es un reemplazo para el antiguo getOne y es más eficiente en términos de rendimiento. */
        // return editorialRepositorio.getReferenceById(id);

        //método utilizado por Lu:
        return editorialRepositorio.findById(id).orElse(null);
    }

    
}
