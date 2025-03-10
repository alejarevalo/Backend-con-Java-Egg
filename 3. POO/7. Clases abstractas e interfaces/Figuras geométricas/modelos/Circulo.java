package modelos;

public class Circulo extends Figura implements Dibujable{
    private Double radio;

    public Circulo() {}

    public Circulo(Double radio) {
        this.radio = null; // se debe poner el wrapper Double para que se pueda poner el null
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
   
    @Override
    public void calcularArea() {
        System.out.println("Este es el área del círculo");
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("Este es el perímetro del círculo");
    }

    @Override
    public void dibujar() {
        System.out.println("Se está dibujando un círculo");
        
    }

    
}
