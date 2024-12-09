/*
 * Crea una clase llamada Libro con los siguientes atributos: título, autor y número de ISBN. Implementa los métodos equals y hashCode en la clase
 *Libro para que dos libros se consideren iguales si tienen el mismo número de ISBN.
 */
package modelos;

public class Libro {
    private String titulo;
    private String autor;
    private Integer isbn;
    
    public Libro(String titulo, String autor, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Libro otroLibro = (Libro) obj;
        return isbn == otroLibro.isbn;
    }   
    
    @Override
    public String toString(){
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn="+ isbn;
    }

    
}
