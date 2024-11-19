import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[10]; // Arreglo para almacenar hasta 10 rectángulos
        Triangulo[] triangulos = new Triangulo[10]; // Arreglo para almacenar hasta 10 rectángulos
        Circulo[] circulos = new Circulo[10]; // Arreglo para almacenar hasta 10 rectángulos
        int opcion = 0, figuraElegida = 0;
        int indice = 0;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear figura");
            System.out.println("2. Calcular área y perímetro de un rectángulo");
            System.out.println("3. Ver número total de rectángulos creados");
            System.out.println("4. Mostrar datos de un rectangulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que figura desea crear?");
                    System.out.println("1. Rectangulo");
                    System.out.println("2. Triangulo");
                    System.out.println("3. Circulo");
                    figuraElegida = scanner.nextInt();
                    switch (figuraElegida) {
                        case 1:
                            System.out.print("Ingrese el ancho del rectángulo: ");
                            double ancho = scanner.nextDouble();
                            System.out.print("Ingrese el alto del rectángulo: ");
                            double alto = scanner.nextDouble();
                            Rectangulo nuevoRectangulo = new Rectangulo(ancho, alto);
                            rectangulos[Rectangulo.getContadorRectangulos() - 1] = nuevoRectangulo;
                            System.out.println("Rectángulo creado.");
                            break;
                        case 2:
                            System.out.print("Ingrese la base del triangulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("Ingrese el alto del triangulo: ");
                            double altura = scanner.nextDouble();
                            Triangulo nuevoTriangulo = new Triangulo(base, altura);
                            triangulos[Triangulo.getContadorTriangulos() - 1] = nuevoTriangulo;
                            System.out.println("Triangulo creado.");
                            break;
                        case 3:
                            System.out.print("Ingrese el radio del circulo: ");
                            double radio = scanner.nextDouble();
                            Circulo nuevoCirculo = new Circulo(radio);
                            circulos[Circulo.getContadorCirculos() - 1] = nuevoCirculo;
                            System.out.println("Circulo creado.");
                            break;
                        default:
                            System.out.println("No hay esa opcion de figura");
                            break;
                    }

                    break;
                case 2:
                    System.out.print("Ingrese el índice del rectángulo: ");
                    indice = scanner.nextInt();
                    if (indice >= 0 && indice < Rectangulo.getContadorRectangulos()) {
                        System.out.println("Área del rectángulo: " +

                                rectangulos[indice].area());

                        System.out.println("Perímetro del rectángulo: " +

                                rectangulos[indice].perimetro());

                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Número total de rectángulos creados: " +

                            Rectangulo.getContadorRectangulos());

                    break;
                case 4:
                    System.out.print("¿De que rectangulo desea ver su infromacion?: ");
                    indice = scanner.nextInt();
                    if (indice >= 0 && indice < Rectangulo.getContadorRectangulos()) {
                        rectangulos[indice].mostrarDatos();
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}