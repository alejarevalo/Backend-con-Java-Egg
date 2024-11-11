import java.util.Scanner;
/*En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. 
Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, 
se mostrará un mensaje de "Acceso denegado". */
public class IfVerficacionContrasena {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String password  = "1234";
        System.out.println("Ingrese la contrasena");
        String ingreso = sc.nextLine();

        if (password.equals(ingreso)){
            System.out.println("Acceso concedido");
            }else{
                System.out.println("Acceso denegado");
            }
            sc.close();
        }
    }
