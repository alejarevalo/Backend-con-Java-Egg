import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 
        Carro carro1 = new Carro("Mazda", "6", 2024);

        Carro carro2 = new Carro("Renault", "4");

        Carro carro3 = new Carro("Chevrolet");

        Carro carro4 = new Carro();

        carro1.ImprimirCarro();
        carro2.ImprimirCarro();
        carro3.ImprimirCarro();
        carro4.ImprimirCarro();
        */
        Menu();        
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear un carro: ");
        System.out.println("Ingresa la marca del vehiculo o N para no ingresarla: ");
        String marca = sc.nextLine();
        if (marca.equalsIgnoreCase("N")) {
            marca = null;
        }
        System.out.println("Ingresa el modelo del vehiculo o N para no ingresarla: ");
        String modelo = sc.nextLine();
        if (modelo.equalsIgnoreCase("N")) {
            modelo = null;
        }
        System.out.println("Ingresa el año del vehiculo o 0 para no ingresarla: ");
        Integer anio = sc.nextInt();
        if (anio == 0) {
            anio = null;
        }

        Carro carro1 = new Carro(marca, modelo, anio);
        carro1.ImprimirCarro();

    }

}