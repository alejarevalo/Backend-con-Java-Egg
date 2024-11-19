/*En la misma carpeta modelos, crea una nueva  clase llamada Circulo. Define los atributos necesarios para calcular el área y el perímetro de la 
figura geométrica. Implementa los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. Además, desarrolla métodos
 para calcular el área y el perímetro del círculo. Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.
 */
public class Circulo {
    private double radio;
    static int contadorCirculos = 0;

    // metodo constructor sin parametros
    public Circulo() {
        contadorCirculos++;
    }

    // metodo constructor con parametros
    public Circulo(double radio) {
        this.radio = radio;
        contadorCirculos++;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) { // Validación para asegurar que el radio sea positivo
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser un valor positivo.");
        }
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public static int getContadorCirculos() {
        return contadorCirculos;
    }

    public void mostrarDatos() {
        System.out.println("Datos de este círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}