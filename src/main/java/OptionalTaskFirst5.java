import java.util.Scanner;

public class OptionalTaskFirst5 {
    public static void main(String[] args) {
        // 5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }



    }
}
