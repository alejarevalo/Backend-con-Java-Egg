package com.egg.servicios;

import com.egg.entidades.Oficina;
import com.egg.persistencia.OficinaDAO;


public class OficinaServicio {


    private final OficinaDAO daoOficina;// Instancio a la unidad d persistencia para acceder a los metodos del EM


    public OficinaServicio() {
       this.daoOficina = new OficinaDAO();
    }


    public void crearOficina(String codigodOficina, String ciudad, String pais,
            String region, String telefono, String codigoPostal) {

        try {
            // Crear una nueva instancia de Oficina
            Oficina oficinaNueva = new Oficina();

            oficinaNueva.setCodigoOficina(codigodOficina);
            oficinaNueva.setCiudad(ciudad);
            oficinaNueva.setPais(pais);
            oficinaNueva.setRegion(region);
            oficinaNueva.setTelefono(telefono);
            oficinaNueva.setCodigoPostal(codigoPostal);

            // Llamar al método de OficinaDAO para guardar la nueva oficina
            daoOficina.guardarOficina(oficinaNueva);
            System.out.println("Oficina creada con exito");

        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo la nueva oficina de manera correcta");
        }

    }
}
