/*Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
Opción 1: "Circulo"
Opción 2: "Rectangulo"
Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
Para el Rectángulo: Solicita el valor de la base y de la altura.
Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado. */
import java.util.Scanner;
public class SwitchAreaYPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            ¿Qué figura quieres calcular?
            Opción 1: Circulo
            Opción 2: Rectangulo
            Ingresa el número de la opción:
            """);
        int opcion = sc.nextInt();

        double area, perimetro;

        switch (opcion) {
            case 1: { System.out.println("Ingresa el radio:");
            double radio  = sc.nextDouble();
            area =  Math.PI * Math.pow(radio, 2); //math pow para potenciación, I guess 
            perimetro = 2 * Math.PI * radio;
            break;
            }
            case 2: { System.out.println("Ingresa la base del rectángulo:");
            double base = sc.nextDouble();
            System.out.println("Ingresa la altura del rectángulo:");
            double altura = sc.nextDouble(); 
            area = base * altura;
            perimetro = 2 * (base + altura);
            break;
            }
            default:  {
                System.out.println("Opción no válida");
                area = 0;
                perimetro = 0;
            break;
            }
        }//end switch 
        
        System.out.println("Ingresa una opcion: '1.-area' o '2.-perimetro'");
        int operacion = sc.nextInt();
        
        // uso del switch clásico:
        switch (operacion) {
            case 1: System.out.println("El area es :" + (Math.round(area))); // math round para redondear el número
            break;
            case 2: System.out.println("El perimetro es :" + perimetro);
            break;
            default: System.out.println("Opcion no valida");
            break;
        }
        sc.close();
    }//end main
}//end class
