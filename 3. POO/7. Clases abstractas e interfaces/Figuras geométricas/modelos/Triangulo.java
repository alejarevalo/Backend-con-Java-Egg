package modelos;

public class Triangulo extends Figura implements Dibujable {

    private Double base;
    private Double altura;

    public Triangulo() {}  

    public Triangulo(Double base, Double altura) {
        this.base = null;
        this.altura = null; // se debe poner el wrapper Double para que se pueda poner el null
    }
    
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
       System.out.println("Este es el área del triángulo");        
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Este es el Perímetro del triángulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Se está dibujando un triángulo");        
    }
        
}
