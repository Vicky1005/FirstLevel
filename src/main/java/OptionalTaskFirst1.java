import java.util.Arrays;
import java.util.Scanner;

public class OptionalTaskFirst1 {
    public static void main(String[] args) {
        // 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        int count = 0;
        int temporary;
        int[] numbersLenght = new int[numbers.length];
        for (int i = 0; i < numbersLenght.length; i++) {
            temporary = numbers[i];
            while (temporary != 0) {
                temporary /= 10;
                count++;
                numbersLenght[i] = count;
            }
            count = 0;
        }

        int maxLenght = (int) Double.NEGATIVE_INFINITY;
        int maxNumber = numbers[0];
        for (int i = 0; i < numbersLenght.length; i++) {
            if (maxLenght < numbersLenght[i]) {
                maxLenght = numbersLenght[i];
                maxNumber = numbers[i];
            }
        }
        int minLenght = (int) Double.POSITIVE_INFINITY;
        int minNumber = numbers[0];
        for (int i = 0; i < numbersLenght.length; i++) {
            if (minLenght > numbersLenght[i]) {
                minLenght = numbersLenght[i];
                minNumber = numbers[i];
            }
        }
        System.out.println("The longest number is " + maxNumber + " - contains " + maxLenght + " chars");
        System.out.println("The shortest number is " + minNumber + " - contains " + minLenght + " chars");
    }
}




