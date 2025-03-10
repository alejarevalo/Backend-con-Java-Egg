package com.egg;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.egg.servicios.*;

public class Application {

    public static void main(String[] args) {
        // EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
        // EntityManager em = emf.createEntityManager();
        // if (em != null) {
        //     System.out.println("Correcto");
        // }

        // Instanciar la clase OficinaServicio para acceder a sus métodos
        OficinaServicio oficinaServicio = new OficinaServicio();

        // Llamar al método del servicio para crear una nueva oficina
        oficinaServicio.crearOficina("OFI01", "Mendoza", "Argentina", "Cuyo", "11111111",
                "CP5000");


    }

}
