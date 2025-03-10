package modelos;

public class Revista extends Itembiblioteca implements Catalogable {
    private Integer nroEdicion;
    private Integer cantidadEjemplares;
    private String nombreRevista;

    
    public Revista() {}

    public Revista(Integer nroEdicion, Integer cantidadEjemplares, String nombreRevista) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(Integer nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void calcularMultas() {
        System.out.println("Multas de la revista");        
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo revista.");        
    }

    @Override
    public void prestar() {
        System.out.println("Prestando revista.");        
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Obteniendo info de la revista");        
    }

    
}
