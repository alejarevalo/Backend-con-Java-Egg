import java.util.Scanner;

public class SumaAcumuladaChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        boolean seguir = true;
        char opcion;  // Cambiamos la opción de String a char
        
        do {
            System.out.println("Ingresa un número entero positivo:");
            int num = sc.nextInt();
            suma += num;

            do {  // Verificar que el usuario ingrese 'S' o 'N'
                System.out.println("¿Desea ingresar otro número? (S/N)");
                opcion = sc.next().toUpperCase().charAt(0);  // Tomamos el primer carácter de la entrada

                if (opcion == 'N') {
                    seguir = false;
                } else if (opcion == 'S') {
                    seguir = true;
                } else {
                    System.out.println("Ingresaste una opción inválida.");
                }

            // Condición de salida: mientras no sea 'S' ni 'N', seguimos pidiendo la opción
            } while (opcion != 'N' && opcion != 'S');

        } while (seguir);

        sc.close();
        System.out.printf("La suma acumulada de los números ingresados es: %d\n", suma);
    }
}
