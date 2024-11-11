/*Escribe un programa que solicite al usuario que ingrese una contraseña y 
verifique si cumple con los siguientes criterios para considerarse segura:

- La contraseña debe tener al menos 8 caracteres.
- La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
- La contraseña debe contener al menos un número.
- La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).

El programa debe mostrar un mensaje indicando si la contraseña es segura o no, 
según los criterios establecidos. Puedes utilizar métodos de la clase String para 
verificar cada uno de los criterios. */

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class ContrasenaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        String password = scanner.nextLine();
        scanner.close();
        //boolean esSegura = false;
        String simbols = "";
        if (password.length()>=8) {
            System.out.println("La contraseña tiene al menos 8 caracteres.");            
        } else {
            System.out.println("La contraseña debe contener al menos 8 caracteres.");
            System.exit(0);
        }
        
        if(!(password.chars().anyMatch(Character::isUpperCase)
        && password.chars().anyMatch(Character::isLowerCase)
        && password.chars().anyMatch(Character::isDigit)
        && password.chars().anyMatch((c) -> simbols.indexOf(c) >= 0))){
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los criterios de seguridad.");
        }   
               
    }
}
