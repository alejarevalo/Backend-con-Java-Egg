/*Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que 
adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor 
que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente. */
import java.util.Scanner;
public class AdivineNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random()*20)+1; ///AL FIN NO SE CUAL ES LA BERRACA FÓRMULA
        System.out.println(aleatorio);
        int elegido = 0;
        System.out.println("Adivina el número");
        do{
            elegido = sc.nextInt();
            if (elegido>aleatorio) {
                System.out.println("El número que ingresas es mayor");
            } else if  (elegido<aleatorio) {
                System.out.println("El número que ingresas es menor");
            } else if (elegido == aleatorio){
                System.out.println("¡Lo has adivinado!");
            }

        } while (elegido != aleatorio);
        sc.close();
    }
}
