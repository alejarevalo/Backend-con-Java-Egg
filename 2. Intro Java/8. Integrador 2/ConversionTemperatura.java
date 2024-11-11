/*
De Celsius a Fahrenheit: [°F] = ([°C] × 9 ⁄ 5) + 32
De Fahrenheit a Celsius: [°C] = ([°F] − 32) × 5 ⁄ 9
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura = 0;
        boolean continuar = true;

        try {
        System.out.println("Ingresa la temperatura:");
        temperatura = sc.nextDouble();     
        } catch (InputMismatchException e){
           System.out.println("Error: debes ingresar un valor numérico: "+e.getMessage());
           continuar = false;
           //System.exit(0);  //o así para interrumpir el programa

        }
        sc.nextLine();
        if  (continuar) {
            System.out.println("Ingresa la unidad de medida de origen: Celsius (C) Fahrenheit (F): ");
            String unidad = sc.nextLine();
            unidad = unidad.toUpperCase();
            sc.close();
            double resultado = switch (unidad) {
                case "C" -> (temperatura*9/5)+32;
                case "F" -> (temperatura-32)*5/9;
                default ->  {
                    System.out.println("Unidad de medida no válida");
                    yield 0;
                }
            };
            String mensaje1 = temperatura+"°C es igual a "+resultado+"°F";
            String mensaje2 = temperatura+"°F es igual a "+resultado+"°C"; 
            if  (unidad.equals("C")) {
                System.out.println(mensaje1);
                } else if  (unidad.equals("F")) {
                    System.out.println(mensaje2);
                }
           
        }else{
            System.out.println("No se puede continuar con la conversión");
        }
    }//main end
}//class end
