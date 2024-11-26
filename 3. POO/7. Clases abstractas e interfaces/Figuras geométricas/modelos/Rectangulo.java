package modelos;

public class Rectangulo extends Figura implements Dibujable {

    private Double ancho;
    private Double alto;


    public Rectangulo() {}    

    public Rectangulo(double ancho, double alto) {
        this.ancho = null; // se debe poner el wrapper Double para que se pueda poner el null
        this.alto = null;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        System.out.println("Este es el área del rectángulo");
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("Este es el perímetro del rectángulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Se está dibujando un rectángulo");
        
    }
    
    
}
