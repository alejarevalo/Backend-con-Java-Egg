package entidades;

public class Familia {
    private int id;
    private String nombre; 
    private int edadMinima;
    private int edadMaxima; 
    private int numHijos; 
    private String email;

    public Familia() {
    }

    public Familia(int id, String nombre, int edadMinima, int edadMaxima, int numHijos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.email = email;
    }

    public Familia(String nombre, int edadMinima, int edadMaxima, int numHijos, String email) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedadMinima() {
        return edadMinima;
    }

    public void setedadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getedadMaxima() {
        return edadMaxima;
    }

    public void setedadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getnumHijos() {
        return numHijos;
    }

    public void setnumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Familia [id=" + id + ", nombre=" + nombre + ", edadMinima=" + edadMinima + ", edadMaxima="
                + edadMaxima + ", numHijos=" + numHijos + ", email=" + email + "]";
    } 

    

    

}
