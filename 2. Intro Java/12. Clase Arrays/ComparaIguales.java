import java.util.Arrays;

public class ComparaIguales {
    public static void main(String[] args) {
        int[] array1  = {1, 2, 3, 4, 5};
        int[] array2 =  {1, 2, 3, 7, 5};

        boolean esIgual = Arrays.equals(array1, array2);

        if (esIgual) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

    }//main
}//class
