import java.util.Scanner;

public class MainTask2 {

    public static void main(String[] args) {
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
