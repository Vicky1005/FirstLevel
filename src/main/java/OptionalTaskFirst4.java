import java.util.Scanner;

public class OptionalTaskFirst4 {
    public static void main(String[] args) {
        //4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        System.out.println();

    }

    public int getCount(int a) {
        int count = 0;
        while (a != 0) {
            a %= 10;
            a /= 10;
            count++;
        }
        int[] array = new int[count];
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = a % 10;
            array[i] = temp;
            a /= 10;
        }
        int countDigits = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
    }
}
