package modelos;

public class Pelicula extends Itembiblioteca implements Catalogable {
    
    @Override
    public void calcularMultas() {
        System.out.println("Multas de la película");        
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo película.");        
    }

    @Override
    public void prestar() {
        System.out.println("Prestando película.");        
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Obteniendo info de la película");        
    }

    
}
