import modelos.Circulo;
import modelos.Rectangulo;
import modelos.Triangulo;

public class App{
    public static void main(String[] args) {
    
        Circulo circulo1 = new Circulo(5.5);
        Triangulo triangulo1 = new Triangulo();
        Rectangulo rectangulo1 = new Rectangulo();

        //Métodos llamados de cada clase que a su vez llaman a los métodos de la clase madre abstracta (Figura)
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();

        circulo1.dibujar();// de la interfaz (Dibujable)
    
    }

}