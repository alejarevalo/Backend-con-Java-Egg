package com.egg.persistencia;

import java.util.List;
import com.egg.entidades.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibroDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    // public void buscarLibro(Long isbn) {
    //     Libro libro = em.find(Libro.class, isbn);
    // }

    public Libro buscarLibro(Long isbn) {
        return em.find(Libro.class, isbn);        
    }

    public void modificarLibro(Libro libro) throws Exception {
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }

    public void eliminarLibro(Long isbn) throws Exception {
        Libro libro = em.find(Libro.class, isbn);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    public void guardarLibro(Libro libro) throws Exception {
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }

    public List<Libro> listarLibros() {
        return em.createQuery("SELECT l FROM Libro l").getResultList(); // va aqui porque es una consulta
    }

    public List<Libro> buscarLibroPorTitulo(String titulo){
        String query = "SELECT l FROM Libro l WHERE titulo LIKE :titulo";
        return em.createQuery(query, Libro.class).setParameter("titulo", "%" + titulo + "%").getResultList();
    }

    public List<Libro> listarLibrosPorNombreAutor(String nombreAutor) throws Exception {
        String query = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre_autor";
        return em.createQuery(query, Libro.class)
        .setParameter("nombre_autor", "%" + nombreAutor + "%")
        .getResultList();
    }

    public List<Libro> listarLibrosPorNombreEditorial(String nombreEditorial) throws Exception {
        String query = "SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre_editorial";
        return em.createQuery(query, Libro.class)
                .setParameter("nombre_editorial", nombreEditorial)
                .getResultList();
    }
    
}


