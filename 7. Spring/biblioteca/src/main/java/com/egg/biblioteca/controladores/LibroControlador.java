package com.egg.biblioteca.controladores;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.egg.biblioteca.entidades.*;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/libro")
public class LibroControlador {
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar")
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        return "libro_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, 
                            @RequestParam String titulo, 
                            @RequestParam(required = false) Integer ejemplares,
                            @RequestParam  String idAutor,
                            @RequestParam  String idEditorial,
                            ModelMap modelo) {
        try {
             // Realizamos la conversión manual de String a UUID. En este caso, se convertirá solo si el ID no es nulo y no está vacío
            UUID autorUUID = (idAutor != null && !idAutor.isEmpty()) ? UUID.fromString(idAutor) : null;
            UUID editorialUUID = (idEditorial != null && !idEditorial.isEmpty()) ? UUID.fromString(idEditorial) : null;

           if (autorUUID == null || editorialUUID == null) {
                throw new MiException("Debe seleccionar un autor y una editorial válidos.");
            }
            libroServicio.crearLibro(isbn, titulo, ejemplares, autorUUID, editorialUUID);
            modelo.put("exito", "Libro creado con éxito");
            
        }catch (MiException ex){
            modelo.put("error", ex.getMessage());
            return "libro_form.html"; // volvemos a cargar el formulario.
        }
        
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }
    
    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
        Libro libro = libroServicio.getOne(isbn);        
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();

         //En la línea donde el template espera ${libro.isbn}, si el objeto libro es null, entonces Thymeleaf 
         //no podrá resolver libro.isbn, lo que causaría una excepción. Recomienda GPT entonces:
        if (libro == null) {
            modelo.put("error", "El libro con ISBN " + isbn + " no existe.");
            return "redirect:/libro/lista";
        }

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        modelo.put("libro", libroServicio.getOne(isbn));

        modelo.addAttribute("autorSeleccionado", libro.getAutor().getId());  // UUID del autor actual para que ya aparezca seleccionado
        modelo.addAttribute("editorialSeleccionada", libro.getEditorial().getId());  // UUID de la editorial actual para que ya aparezca seleccionado

        return "libro_modificar.html";
    }
    
    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable @RequestParam(required = false) Long isbn, 
                            @RequestParam String titulo, 
                            @RequestParam Integer ejemplares, 
                            @RequestParam String idAutor, 
                            @RequestParam String idEditorial, 
                            RedirectAttributes redirectAttributes,
                            ModelMap modelo) {
        try {
            System.out.println("ID Autor recibido: " + idAutor);//depurar
            System.out.println("ID Editorial recibido: " + idEditorial);//depurar

            UUID autorUUID = (idAutor != null && !idAutor.isEmpty()) ? UUID.fromString(idAutor) : null;
            UUID editorialUUID = (idEditorial != null && !idEditorial.isEmpty()) ? UUID.fromString(idEditorial) : null;

            if (autorUUID == null || editorialUUID == null) {
                throw new MiException("Debe seleccionar un autor y una editorial válidos.");
            }

            libroServicio.modificarLibro(isbn, titulo, ejemplares, autorUUID, editorialUUID);
            redirectAttributes.addFlashAttribute("exito", "Libro modificado con éxito");
            return "redirect:../lista";
        } catch (MiException ex) {
            /*  ✅ El @GetMapping solo se ejecuta cuando accedes directamente a la página de modificación.
                ❌ No se ejecuta automáticamente si un @PostMapping con error redirige de vuelta a la plantilla.
                🔄 Por eso, en el catch, debemos volver a cargar las listas (autores, editoriales) para que la vista no falle: */
                modelo.addAttribute("autores", autorServicio.listarAutores());
                modelo.addAttribute("editoriales", editorialServicio.listarEditoriales());
            redirectAttributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:../modificar/" + isbn;
           // return "libro_modificar.html";
        }
    }

}
