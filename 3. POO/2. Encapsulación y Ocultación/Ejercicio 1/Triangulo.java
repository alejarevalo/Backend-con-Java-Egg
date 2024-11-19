public class Triangulo {
    private double base;
    private double altura;
    static int contadorTriangulos = 0;

    // metodo constructor con parametros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        contadorTriangulos++;
    }

    // metodo constructor con parametros
    public Triangulo() {
        contadorTriangulos++;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("La base no puede ser negativa o 0");
        } else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("La altura no puede ser negativa o 0");
        } else {
            this.altura = altura;
        }
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return base * 3;
    }

    public static int getContadorTriangulos() {
        return contadorTriangulos;
    }

    public void mostrarDatos() {
        System.out.println("Datos de este Triangulo:");
        System.out.println("base: " + base);
        System.out.println("altura: " + altura);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }
}
