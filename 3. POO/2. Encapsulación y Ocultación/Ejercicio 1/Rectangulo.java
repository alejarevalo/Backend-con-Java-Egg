public class Rectangulo {
    private double ancho;
    private double alto;
    static int contadorRectangulos = 0;

    // metodo constructor con parametros
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // metodo constructor con parametros
    public Rectangulo() {
        contadorRectangulos++;
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

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }

    public void mostrarDatos() {
        System.out.println("Datos de este rectangulo:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }
}