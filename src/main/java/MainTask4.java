import java.util.Scanner;

public class MainTask4 {

    public static void main(String[] args) {
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of numbers is " + sum);


        int multiplication = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            multiplication = multiplication * numbers[i];

        }
        System.out.println("The multiplication of numbers is " + multiplication);
    }
}
