/*Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, 
genera una copia del mismo con una extensión de 2 elementos adicionales.
Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
Finalmente, muestra por consola el contenido del nuevo array.
Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de 
bucles en el proceso. */

import java.util.Scanner;

public class CopiaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = {1,2,3};
        System.out.println("Ingrese dos números para llenar el array:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] arreglo2 = { arreglo[0], arreglo[1], arreglo[2], num1, num2 };

        //solo para mostrar
        for (int i = 0; i < arreglo2.length; i++) {
        System.out.println(arreglo2[i]);
        };
        scanner.close();
    }
}
