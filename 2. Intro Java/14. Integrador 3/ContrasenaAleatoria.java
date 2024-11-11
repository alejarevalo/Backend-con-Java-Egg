/*Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta 
por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.
Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña
especificada por el usuario. Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula,
una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e 
isDigit de la clase Character.
Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña 
generada en la consola. */

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class ContrasenaAleatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la longitud de la contraseña");
        int longitude = scanner.nextInt();
        char[] array = new char[longitude];
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        boolean tieneMayusculas = false;
        boolean tieneMinusculas = false;
        boolean tieneNumeros = false;
        while (!tieneNumeros || !tieneMayusculas || !tieneMinusculas) {

            tieneMayusculas = false;
            tieneMinusculas = false;
            tieneNumeros = false;
            for (int i = 0; i < array.length; i++) {
                array[i] = caracteres.charAt(random.nextInt(caracteres.length()));
            }
            for (int i = 0; i < array.length; i++) {
                if (Character.isUpperCase(array[i]))
                    tieneMayusculas = true;
                if (Character.isLowerCase(array[i]))
                    tieneMinusculas = true;
                if (Character.isDigit(array[i]))
                    tieneNumeros = true;
            }
        }
        String contrasena = new String();
        for (int i = 0; i < array.length; i++) {
            contrasena += String.valueOf(array[i]);
        }
        System.out.println(contrasena);
        scanner.close();
    }

}
/*
 * import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Collections;


public class App {
public static void main(String[] args) {

Scanner miScaner = new Scanner(System.in);

System.out.print("Ingrese el tamaño de la contraseña:");
int size = miScaner.nextInt();

System.out.println("---------------------");
boolean mayusFlag ;
boolean minusFlag ;
boolean digitFlag ;

char[] password = new char[size];
do{
mayusFlag = false;
minusFlag = false;
digitFlag = false;
for(int i = 0;i<password.length;i++){
password[i] = (char) (Math.random() * (122 - 48) +48);
System.out.println(password[i]);

if(Character.isUpperCase(password[i])){
mayusFlag=true;
}
if(Character.isLowerCase(password[i])){
minusFlag=true;
}
if(Character.isDigit(password[i])){
digitFlag=true;
}

}
}while(!mayusFlag || !minusFlag || !digitFlag);

String resultado = new String(password);
System.out.println("Listo! La clave es:" +resultado);



}
}
 * 
 */