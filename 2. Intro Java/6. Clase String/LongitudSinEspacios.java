import java.util.Scanner;
/*En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su 
longitud, pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará 
el método length() de la clase String y se realizará un proceso adicional para excluir los 
espacios de la cuenta. */
public class LongitudSinEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa  una cadena de texto: ");
        String texto = sc.nextLine();
        String textoSinEspacios = texto.replace(" ","");
        int longitud = textoSinEspacios.length();
        System.out.println("La longitud con espacios es: " + texto.length());// para comparar
        System.out.println("La longitud sin espacios es: " + longitud);

        sc.close();
    }
}
