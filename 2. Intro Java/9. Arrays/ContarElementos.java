public class ContarElementos {
    public static void main(String[] args) {
        int[] numbers = {8, 4, 7, 8, 9, 6};
        int counter = 0;

        if (numbers[0] % 2 == 0) {
        counter++;
        }
        if (numbers[1] % 2 == 0) {
        counter++;
        }
        if (numbers[2] % 2 == 0) {
        counter++;
        }
        if (numbers[3] % 2 == 0) {
        counter++;
        }
        if (numbers[4] % 2 == 0) {
        counter++;
        }
        if (numbers[5] % 2 == 0) {
        counter++;
        }
        
        System.out.println("The amout of elements is: " + counter);
    }
}
