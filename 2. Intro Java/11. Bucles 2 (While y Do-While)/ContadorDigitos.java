/*Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad 
de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 
tiene una cifra y también contar las cifras de números negativos. */
public class ContadorDigitos {
    public static void main(String[] args) {
        int num = -123, contDigitos = 0;
        if (num == 0) {
            contDigitos++;
        }
        while (num != 0) {
            contDigitos++;
            num = (int) num / 10;
        }
        System.out.println(contDigitos);
    }
}
