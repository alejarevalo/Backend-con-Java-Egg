import java.util.Scanner;

public class SwitchSeleccionOpcion {
    public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

    System.out.println("""
    Selecciona una opción, digita solo el numero (Ej. 2):
    Opcion 1: "Guardar"
    Opcion 2: "Cargar"
    Opcion 3: "Salir"
    """);
    int num = myScan.nextInt();

    String opcion = switch (num) {
        case 1 -> "Guardado";
        case 2 -> "Cargado";
        case 3 -> "Has salido del sistema";
        default -> "Opción no valida";
    };// end switch option

    System.out.println(opcion);

    myScan.close();
    }// end main
}// end class