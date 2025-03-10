package com.egg.persistencia;

import java.util.List;

import com.egg.entidades.Autor;
import com.egg.entidades.Editorial;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EditorialDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    
    public Editorial buscarEditorial(Integer id) {
        return em.find(Editorial.class, id);
    }

    public void modificarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    public void eliminarEditorial(Integer id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public List<Editorial> listarEditoriales() {
        return em.createQuery("SELECT e FROM Editorial e").getResultList(); // va aqui porque es una consulta
    }

    public List<Editorial> buscarEditorialPorNombre(String nombre) {
        String query = "SELECT e FROM Editorial e WHERE nombre LIKE :nombre";
        return em.createQuery(query, Editorial.class)
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
    }
    
}
