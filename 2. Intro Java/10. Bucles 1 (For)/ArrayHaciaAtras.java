import java.util.Scanner;

public class ArrayHaciaAtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = { 7, 2, 34, 5, 6 };
        for (int i = v.length - 1; i > -1; i--) {
            System.out.println(v[i]);
        }
        sc.close();
    }
}
