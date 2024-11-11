import java.util.Scanner;

/*Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar 
una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios 
para calcular el área de la figura seleccionada. Estos datos serán:
Para el círculo: el radio.
Para el cuadrado: el lado.
Para el triángulo: la base y la altura.
Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada. */

public class SwitchArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion del 1 al 3:");
        System.out.println(" 1 para círculo, 2 para cuadrado y 3 para triángulo.");
        int opcion = scanner.nextInt();
        double area = switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el radio del círculo");
                double radio = scanner.nextInt();
                double areaCirculo = (radio * radio) * Math.PI;
                yield areaCirculo;
            }
            case 2 -> {
                System.out.println("Ingrese el lado del cuadrado");
                double lado = scanner.nextInt();
                double areaCuadrado = lado * lado;
                yield areaCuadrado;
            }
            case 3 -> {
                System.out.println("Ingrese la base del triangulo");
                double base = scanner.nextInt();
                System.out.println("Ingrese la altura del triangulo");
                double altura = scanner.nextInt();
                double areaTriangulo = (base * altura) / 2;
                yield areaTriangulo;
            }
            default -> 0;
        };//end switch
        System.out.println("El área de su figura seleccionada es: " + area);

        scanner.close();
    }// end main
}// end class