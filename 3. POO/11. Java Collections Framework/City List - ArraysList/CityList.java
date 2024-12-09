import java.util.ArrayList;
import java.util.Scanner;

public class CityList{
    static ArrayList<String> cityList = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Qué quieres hacer?");
            System.out.println("1. Agregar ciudad");
            System.out.println("2. Mostrar ciudades");
            System.out.println("3. Salir");
            System.out.println("Selecciona tu opcion:");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa la ciudad:");
                    String ciudad = sc.nextLine();
                    cityList.add(ciudad);
                }
                case 2 -> {
                    // Iterator<String> it = cityList.iterator();
                    // while(it.hasNext()){

                    // }
                    for (String ciudad : cityList) {
                        System.out.println(ciudad);
                    }
                }
                case 3 -> flag = false;
            }
        }while(flag);
        
    }
}