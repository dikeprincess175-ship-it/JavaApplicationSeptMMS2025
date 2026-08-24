package runtime;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Dividing the first number by second number");
            System.out.println("==========================================");
            System.out.print("Enter the first number: ");
            int num = scan.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();

            int divide = num / num2;
            
            System.out.println("\n...................");
                    
            System.out.printf("The result is %d%n: ", divide);
            System.out.println("...................");

        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero, silly");
        }
        finally{
            System.out.println("This part of code will always run ");
        }
    }
}
