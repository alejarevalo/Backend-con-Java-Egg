package modelos;

public class Revista extends Itembiblioteca implements Catalogable {
    
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
