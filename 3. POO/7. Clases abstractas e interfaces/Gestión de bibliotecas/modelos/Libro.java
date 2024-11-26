package modelos;

public class Libro extends Itembiblioteca implements Catalogable {

    @Override
    public void calcularMultas() {
        System.out.println("Multas del libro");        
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo libro.");        
    }

    @Override
    public void prestar() {
        System.out.println("Prestando libro.");        
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Obteniendo info del libro");        
    }
    
    
}
