package modelos;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean estaPrestado;

    public Libro(){}

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.estaPrestado = false;
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

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return this.titulo.equals(libro.getTitulo()) && this.numeroDePaginas == libro.getNumeroDePaginas();
    }

    @Override
    public int hashCode() {        
        return super.hashCode();
    }
    
    //public void mostrarInformacion()
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
                + ", estaPrestado=" + estaPrestado + "]";
    }
   
}
