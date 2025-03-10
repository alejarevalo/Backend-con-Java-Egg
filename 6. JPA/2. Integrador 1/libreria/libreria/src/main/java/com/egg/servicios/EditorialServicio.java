package com.egg.servicios;

import java.security.InvalidParameterException;
import java.util.List;
import com.egg.entidades.Editorial;
import com.egg.persistencia.EditorialDAO;

public class EditorialServicio {
    private final EditorialDAO daoEditorial;
 
    public EditorialServicio(){
        this.daoEditorial = new EditorialDAO();
    }
    
    public Editorial crearEditorial(String nombre) {
        try {
            this.validarData(nombre);
            boolean alta = true;
            Editorial editorialNueva = new Editorial();
            editorialNueva.setNombre(nombre);
            editorialNueva.setAlta(alta);
            daoEditorial.guardarEditorial(editorialNueva);
            return editorialNueva;
        } catch (Exception e) {
            System.out.println("Error al crear la editorial: " + e.getMessage());
            return null;
        }
    }

    public Editorial buscarEditorial(Integer id){
        return daoEditorial.buscarEditorial(id);
    }

    public void actualizarEditorial(Editorial editorial) throws Exception{
        daoEditorial.modificarEditorial(editorial);
    }

    public List<Editorial> listarTodasLosEditoriales(){
        return daoEditorial.listarEditoriales();
    }

    public void eliminarEditorial(Integer id) throws Exception{
        Editorial editorial = buscarEditorial(id);
        if (editorial != null) {
            daoEditorial.eliminarEditorial(id);
        }
    }

    public void darBajaEditorial(Integer id) throws Exception{
        Editorial editorial = buscarEditorial(id);
        if (editorial != null) {
            editorial.setAlta(false);
            daoEditorial.modificarEditorial(editorial);
        }else{
            System.out.println("No existe una editorial con el ID proporcionado: " + id);
        }
    }

    public List<Editorial> buscarEditorialPorNombre(String nombre) {
        try {
            List<Editorial> editoriales = daoEditorial.buscarEditorialPorNombre(nombre);
            if (!editoriales.isEmpty()) {
                return editoriales;
            } else {
                System.out.println("No hay editoriales con ese nombre.");
                return editoriales;
            }
        } catch (Exception e) {
            System.out.println("Hubo un error en la búsqueda." + e.getMessage());
            return null;
        }
    }

        public void validarData(String nombre) throws Exception {
        if (nombre == null) {
            throw new InvalidParameterException("El nombre no puede ser nulo.");
        }
        if (nombre.length() < 2) {
            throw new InvalidParameterException("El nombre debe contener al menos 2 caracteres.");
        }

        if (!this.daoEditorial.buscarEditorialPorNombre(nombre).isEmpty()) {
            throw new InvalidParameterException("La editorial " + nombre + " ya existe en la base de datos.");
        }
    }


}
