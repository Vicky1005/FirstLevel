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
            if (getCount(minNumber) > getCount(numbers[i])) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);

    }

    public static int getCount(int a) {
        int tempA = a;
        int count = 0;
        while (tempA != 0) {
            tempA /= 10;
            count++;
        }
        int[] digits = new int[count];
        int tempNumber;
        for (int i = 0; i < digits.length; i++) {
            tempNumber = a % 10;
            digits[i] = tempNumber;
            a /= 10;
        }
        int countDigits = 0;
        for (int i = 0; i < digits.length; i++) {
            boolean equal = false;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    equal = true;
                }
            }
            if (!equal) {
                countDigits++;
            }
        }
        return countDigits;
    }
}
