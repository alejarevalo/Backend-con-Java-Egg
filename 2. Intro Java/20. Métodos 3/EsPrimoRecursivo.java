import java.util.Scanner;
/*Program to find whether a Number is prime using recursion. */
public class EsPrimoRecursivo {
   public static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter a number:");
    int n = Integer.parseInt(sc.nextLine()); 
    sc.close();
    System.out.println("El número "+n+" es primo? "+ IsPrime(n,2));
   }
   //Returns true if n is prime, else false
   public static boolean IsPrime(int n, int divisor){
    if(divisor < n){
            if(n % divisor == 0){
            return false;
            } else {
            return IsPrime(n, divisor + 1);
            }
        }
        return true;
   }
}


