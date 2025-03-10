package com.egg.persistencia;

import java.util.List;
import com.egg.entidades.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AutorDAO {
    public final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    public final EntityManager em = emf.createEntityManager();

    public void guardarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public Autor buscarAutor(Integer id){
        return em.find(Autor.class, id);
    }

    public void modificarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public void eliminarAutor(Integer id) throws Exception {
        Autor autor = em.find(Autor.class, id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }

    public List<Autor> listarAutores() throws Exception {
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        return autores;
    }

    public List<Autor> buscarAutorPorNombre(String nombre){
        String query = "SELECT a FROM Autor a WHERE nombre LIKE :nombre";
        return em.createQuery(query, Autor.class)
        .setParameter("nombre", "%" + nombre + "%")
        .getResultList();
    }
    /*Al usar :nombre y luego establecer su valor con .setParameter("nombre", "%" + nombre + "%"), evitas que se inserte directamente 
    el valor del usuario en la consulta.
    Esto es crucial: En vez de concatenar directamente el valor del usuario, que podría permitir inyecciones SQL, JPA prepara la consulta
    y se encarga de “escapar” los caracteres especiales.
    Consulta precompilada: Las consultas con parámetros se precompilan, lo que significa que el motor de la base de datos sabe qué 
    parte es la consulta y qué parte es el dato, evitando así que se ejecute código malicioso. */
}

