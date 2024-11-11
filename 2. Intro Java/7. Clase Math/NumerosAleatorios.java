/*Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355 
utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear 
el número aleatorio hacia abajo. */
public class NumerosAleatorios {
    public static void main(String[] args) {
        double numero = (Math.random()*(355-1+1)+1);//formula: Math.round()*(numMax-numMin+1)+numMin
        int NumerosAleatorios = (int) Math.floor(numero);
        System.out.println("El número  aleatorio es: "+NumerosAleatorios);

    }//fin main
}//fin clase

