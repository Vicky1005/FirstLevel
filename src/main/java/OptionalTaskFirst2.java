import java.util.Arrays;
import java.util.Scanner;

public class OptionalTaskFirst2 {
    public static void main(String[] args) {

        //2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    buf = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));


        isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    isSorted = false;
                    buf = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}