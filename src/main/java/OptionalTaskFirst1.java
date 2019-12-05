import java.util.Scanner;

public class OptionalTaskFirst1 {
    public static void main(String[] args) {
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        int number3=scan.nextInt();


        int counter=0;
        while (number1>0) {
            number1=number1%10;
            number1=number1/10;
            counter++;
        }

        System.out.println(counter);
    }
}
