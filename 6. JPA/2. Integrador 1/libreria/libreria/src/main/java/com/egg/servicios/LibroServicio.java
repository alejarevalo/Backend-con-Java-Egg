package com.egg.servicios;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.egg.entidades.Autor;
import com.egg.entidades.Editorial;
import com.egg.entidades.Libro;
import com.egg.persistencia.LibroDAO;

public class LibroServicio {
    private final LibroDAO daoLibro;

    public LibroServicio(){
        this.daoLibro = new LibroDAO();
    }

    private Boolean libroExiste(Libro libro) {
        return !daoLibro.buscarLibroPorTitulo(libro.getTitulo()).isEmpty(); // si la lista con el libro que
        // se busca no está vacía, entonces el libro existe.
    }

    // public void crearLibro(Libro libro) throws Exception {        
    //     if (libroExiste(libro)) {
    //         throw new Exception("El libro ya existe");
    //     }
    //     daoLibro.guardarLibro(libro);
    // }

    public Libro crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Autor autor,
            Editorial editorial) {
        boolean alta = true; 
        Libro libroNuevo = null;
        try {
            validarData(isbn, titulo, anio, ejemplares, autor, editorial);
            libroNuevo = new Libro();

            libroNuevo.setIsbn(isbn);
            libroNuevo.setTitulo(titulo);
            libroNuevo.setAnio(anio);
            libroNuevo.setEjemplares(ejemplares);
            libroNuevo.setAlta(alta);
            libroNuevo.setAutor(autor);
            libroNuevo.setEditorial(editorial);

            daoLibro.guardarLibro(libroNuevo);

        } catch (Exception e) {
            System.out.println(e.toString() + "Error: no se guardó el nuevo libro.");
        }
        return libroNuevo;
    }

    private void validarData(
            Long isbn,
            String titulo,
            Integer anio,
            Integer ejemplares,
            Autor autor,
            Editorial editorial) throws Exception {
        if (isbn == null) {
            throw new InvalidParameterException("ISBN no puede ser nulo.");
        }
        if (titulo == null) {
            throw new InvalidParameterException("Título no puede ser nulo.");
        }

        if (!esAnioValido(anio)) {
            throw new InvalidParameterException("El año debe estar entre 1000 y " + LocalDate.now().getYear());
        }
        
        if (ejemplares < 1) {
            throw new InvalidParameterException("Debe ingresar al menos 1 ejemplar.");
        }
        if (autor == null) {
            throw new InvalidParameterException("El autor no puede ser nulo.");
        }
        if (editorial == null) {
            throw new InvalidParameterException("La editorial no puede ser nula.");
        }

        if (this.daoLibro.buscarLibro(isbn) != null) {
            throw new InvalidParameterException("El libro con ISBN " + isbn + " ya existe en la base de datos.");
        }

    }

    private boolean esAnioValido(int anio) {
        return anio >= 1000 && anio <= LocalDate.now().getYear();
    }

  
    public void actualizarLibro(Libro libro) throws Exception {
        daoLibro.modificarLibro(libro);
    } // ¿qué diferencia hay entre éste y...

    // éste?:
    // public void actualizarLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Boolean alta, Autor autor,
    //         Editorial editorial) throws Exception {
    //     try {
    //         Libro libroAModificar = daoLibro.buscarLibro(isbn);
    //         if (libroAModificar == null) {
    //             System.out.println("El libro que está intentando modificar no se encuentra en la base de datos");
    //             return;
    //         }
    //         libroAModificar.setTitulo(titulo);
    //         libroAModificar.setAnio(anio);
    //         libroAModificar.setEjemplares(ejemplares);
    //         libroAModificar.setAlta(alta);
    //         libroAModificar.setAutor(autor);
    //         libroAModificar.setEditorial(editorial);

    //         daoLibro.modificarLibro(libroAModificar);

    //     } catch (Exception e) {
    //         System.out.println(e.toString() + "El libro no se modificó de manera correcta.");
    //     }
    // }

    public Libro buscarLibro(Long isbn) {
        try {
            Libro libro = daoLibro.buscarLibro(isbn);
            if (libro == null) {
                System.out.println("No existe un libro con el isbn proporcionado: " + isbn);
            }
            return libro;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al buscar el libro: " + e.getMessage());
        }
        return null;
    }

    public void darBajaLibro(Long isbn) throws Exception{
        Libro libro = buscarLibro(isbn);
        if (libro != null) {
            libro.setAlta(false);
            daoLibro.modificarLibro(libro);
        }else{
            System.out.println("No existe un libro con el isbn proporcionado: " + isbn);
        }
    }

    public List<Libro> listarTodosLosLibros() throws Exception {
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : daoLibro.listarLibros()) {
            // Si el libro no ha sido "eliminado"...
            if (libro.isAlta())
                libros.add(libro); // ... lo agregamos a la lista.
        }
        return libros;
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        return daoLibro.buscarLibroPorTitulo(titulo);
    }

    public List<Libro> listarLibrosPorNombreAutor(String nombreAutor) {
        if (nombreAutor.isEmpty()) {
            System.out.println("El nombre del autor no puede estar vacío.");
            return null;
        }
        try {
            List<Libro> libros = daoLibro.listarLibrosPorNombreAutor(nombreAutor);
            imprimirLista(libros);
            return libros;
        } catch (Exception e) {
            System.out.println(e.toString() + "No se pudo listar los libros de manera correcta.");
            return null;
        }
    }

    public List<Libro> listarLibrosPorNombreEditorial(String nombreEditorial) {
        if (nombreEditorial.isEmpty()) {
            System.out.println("El nombre de la editorial no puede estar vacío");
            return null;
        }
        try {
            List<Libro> libros = daoLibro.listarLibrosPorNombreEditorial(nombreEditorial);
            imprimirLista(libros);
            return libros;
        } catch (Exception e) {
            System.out.println(e.toString() + "No se pudo listar los libros de manera correcta");
            return null;
        }
    }

    public void imprimirLista(List<Libro> listaRecibida) throws Exception {
        try {
            for (Libro unitariaLibro : listaRecibida) {
                System.out.println(unitariaLibro.getIsbn() + " - " + unitariaLibro.getTitulo() + " - "
                        + unitariaLibro.getAnio());
            }
        } catch (Exception e) {
            System.out.println(e.toString() + "No se pudo imprimir los libros de manera correcta");
        }
    }

    


}
