import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();

            if (i == 1 || i == 5 || i == 10) {
                sum1 += num;
            }

            if (i == 2 || i == 3 || i == 8) {
                sum2 += num;
            }

            if (i == 4 || i == 6 || i == 7 || i == 9) {
                sum3 += num;
            }
        }

        int product = sum1 * sum2;
        int result = sum3 - product;

        if (result >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}