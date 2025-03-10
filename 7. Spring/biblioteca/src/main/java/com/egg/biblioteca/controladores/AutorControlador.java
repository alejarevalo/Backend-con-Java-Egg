
package com.egg.biblioteca.controladores;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;

import org.springframework.web.bind.annotation.PostMapping;


// import java.util.logging.Level; // La guía propuso importar esto pero no sé por qué ??
// import java.util.logging.Logger; // ??



@Controller
@RequestMapping("/autor") // localhost:8080/autor
public class AutorControlador {
    @Autowired
    private AutorServicio autorServicio;

    @GetMapping ("/registrar")// localhost:8080/autor/registrar
    public String registrar(){
        return "autor_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        try {
            autorServicio.crearAutor(nombre);  // llamo a mi servicio para persistir
            modelo.put("exito", "Autor creado con éxito");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "autor_form.html";
        }
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List <Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, ModelMap modelo) {
        modelo.put("autor", autorServicio.getOne(id));
        return "autor_modificar.html";
    }

    // @PostMapping("/modificar/{id}")
    // public String modificar(@PathVariable UUID id, String nombre, ModelMap modelo) {        
    //     try {
    //         System.out.println("ID recibido en la URL para modificar: " + id); // Depuración
    //         autorServicio.modificarAutor(nombre, id);
            // if (autor == null) {
            //     modelo.put("error", "El autor no fue encontrado.");
            //     return "redirect:/autor/lista"; // Redirige a la lista si el autor no existe
            // }
    //         return "redirect:../lista";
    //     } catch (MiException ex) {
    //         modelo.put("error", ex.getMessage());
    //         return "autor_modificar.html";
    //     }
    // }  

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, String nombre, RedirectAttributes redirectAttributes) {
        /*RedirectAttributes permite pasar atributos temporales durante una redirección.
        Estos atributos solo están disponibles en la siguiente solicitud y se eliminan después. Es decir, mantiene datos en la siguiente 
        solicitud tras un redirect. addFlashAttribute() los mantiene disponibles tras la redirección. */
        try {
            autorServicio.modificarAutor(nombre, id);            

            redirectAttributes.addFlashAttribute("exito", "El autor fue modificado correctamente");
            return "redirect:../lista"; // Mensaje disponible tras redirección
        } catch (MiException ex) {
            redirectAttributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:../modificar/" + id; // Redirige al formulario con mensaje de error
        }
    
    }

}
