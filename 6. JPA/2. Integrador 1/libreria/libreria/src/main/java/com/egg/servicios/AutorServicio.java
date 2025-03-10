package com.egg.servicios;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import com.egg.entidades.Autor;
import com.egg.persistencia.AutorDAO;

public class AutorServicio {
    private final AutorDAO daoAutor;

    public AutorServicio() {
        this.daoAutor = new AutorDAO();
    }

    public Boolean autorExiste(Autor autor){
        return !daoAutor.buscarAutorPorNombre(autor.getNombre()).isEmpty(); //si la lista con el autor que 
        //se busca no está vacía, entonces el autor existe.
    }

  // public void crearAutor (int idAutor, String nombre, boolean alta){
    //     try{
    //         Autor autorNuevo = new Autor();

    //         autorNuevo.setIdAutor(idAutor);
    //         autorNuevo.setNombre(nombre);
    //         autorNuevo.setAlta(alta);

    //         daoAutor.guardarAutor(autorNuevo); // llamamos al método de AutorDAO para guardarlo.

    //     }catch (Exception e){
    //         System.out.println("Error al crear el autor: "+e.toString());
    //     }
    // }

    public Autor crearAutor(String nombre) {
        try {
            this.validarData(nombre);// ¿si hay alguna excepción en validarData, eso hará que el programa se salga de crearAutor? Yep
            boolean alta = true; // si se está creando es porque estará indefectiblemente de alta.
            Autor autorNuevo = new Autor();
            autorNuevo.setNombre(nombre);
            autorNuevo.setAlta(alta);
            daoAutor.guardarAutor(autorNuevo);
            return autorNuevo;
            
        } catch (Exception e) {            
            System.out.println("Error al crear el autor: "+e.toString());
            return null;
        }
    }

    public void actualizarAutor(Autor autor) throws Exception {
        daoAutor.modificarAutor(autor);
    }
 
    public Autor buscarAutor(Integer idAutor) {
        try {
            Autor autor = daoAutor.buscarAutor(idAutor);
            if (autor == null || autor.isAlta()==false) {
                System.out.println("No existe un autor con el ID proporcionado: " + idAutor);
            }
            return autor;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al buscar el autor: " + e.getMessage());
        }
        return null;
    }

    /*AutorServicio : Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias 
    para administrar autores (consulta, creación, modificación y eliminación). Recomendamos gestionar un 
    método para eliminar, y comprender su lógica de aplicación, y un método darBaja, para setear el atributo 
    booleano. (qué es cómo se gestiona en el ámbito de desarrollo).  */

    public void eliminarAutor(Integer id) throws Exception{
        Autor autor = buscarAutor(id);
        if (autor != null) {
            daoAutor.eliminarAutor(id);
        }
    }

    public void darBajaAutor(Integer id) throws Exception{
        Autor autor = buscarAutor(id);
        if (autor != null) {
            autor.setAlta(false);
            daoAutor.modificarAutor(autor);
            System.out.println("Autor eliminado exitosamente.");
        }else{
            System.out.println("No existe un autor con el ID proporcionado: " + id);
        }
    }

    public List<Autor> listarTodosLosAutores() throws Exception {
        List<Autor> autores = new ArrayList<>();
        for (Autor autor : daoAutor.listarAutores()) {
            // Si el autor no ha sido "eliminado"...
            if (autor.isAlta())
                autores.add(autor); // ... lo agregamos a la lista.
        }
        return autores;
    }

    public List<Autor> buscarAutorPorNombre(String nombre) {
        try {
            List <Autor> autores = daoAutor.buscarAutorPorNombre(nombre);
            if (!autores.isEmpty()) {
                return autores;
            }else{
                System.out.println("No hay autores con ese nombre.");
                return autores;
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

        if (!this.daoAutor.buscarAutorPorNombre(nombre).isEmpty()) {
            throw new InvalidParameterException("El autor " + nombre + " ya existe en la base de datos.");
        }
    }

}
