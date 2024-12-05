package modelos;

import java.util.HashSet;
/*
Crea una clase llamada Libreria que contenga un HashSet para almacenar los libros en tu catálogo.
Implementa un método agregarLibro en la clase Libreria que tome como parámetro un objeto Libro y lo agregue al HashSet. 
Asegúrate de que no se permitan libros duplicados en tu catálogo.
- Implementa un método eliminarLibro en la clase Libreria que tome como parámetro un número de ISBN y 
elimine el libro correspondiente del HashSet, si existe.
- Implementa un método mostrarCatalogo en la clase Libreria que imprima por pantalla la lista de libros en tu catálogo.
 */
public class Libreria {
    private HashSet<Libro> libros = new HashSet<>();    

    public void agregarLibro(Libro libro){
        if (!libros.contains(libro)){
            libros.add(libro);
            System.out.println("El libro fue agregado exitosamente.");
        }else{
            System.out.println("El libro ya existe en el catálogo");
        }
    }

    public boolean eliminarLibroPorIsbn(Integer isbn) {
        
        return libros.removeIf(libro -> libro.getIsbn().equals(isbn));
        //opcional hacer un bucle for-each o Iterator
        
    }

    public void mostrarCatalogo(){
        if (!libros.isEmpty()){
            System.out.println(libros);

        }
    }
}

