import java.util.Scanner;

import enums.Color;
import modelos.ConvertidorColor;

public class App{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Prueba con 5 colores hexadecimales:");
        pruebaConvertidorColor();

    }

    public static void pruebaConvertidorColor(){
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingresa el color hexadecimal #%d: ",i+1);
            String valorHexadecimal = sc.nextLine().trim();
            //llamo a la función convertirHexadecimal: 
            Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
            // verifica si el color es válido:
            if (color != null) System.out.println("Es color "+color+" es primario.");
            else System.out.println("No es un color primario");
        }
        sc.close();
    } 
}