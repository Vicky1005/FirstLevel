import java.util.Scanner;

public class OptionalTaskFirst3 {

    public static void main(String[] args) {
        //3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];
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


        int sum = 0;
        for (int i = 0; i < numbersLenght.length; i++) {
            sum += numbersLenght[i];
        }

        int averageLenght = sum / numbersLenght.length;

        for (int i = 0; i < numbersLenght.length; i++) {
            if (numbersLenght[i] < averageLenght) {
                System.out.println("The lenght of number " + numbers[i] + " is less then average. It's equal to " + numbersLenght[i]);
            }
        }

        for (int i = 0; i < numbersLenght.length; i++) {
            if (numbersLenght[i] > averageLenght) {
                System.out.println("The lenght of number " + numbers[i] + " is more then average. It's equal to " + numbersLenght[i]);
            }
        }
    }
}
