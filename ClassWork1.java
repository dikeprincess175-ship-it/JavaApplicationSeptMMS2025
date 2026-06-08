import java.util.Scanner;

public class ClassWork1{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		byte num1 = input.nextByte();
		
		System.out.print("Enter the second number: ");
		byte num2 = input.nextByte();
		
		System.out.print("Enter the third number: ");
		byte num3 = input.nextByte();
		
		System.out.print("Enter the fourth number: ");
		byte num4 = input.nextByte();
		
		System.out.print("Enter the fifth number: ");
		byte num5 = input.nextByte();
		
		
		int product = (num1*num2*num3*num4*num5);
		System.out.printf("The Product of the numbers is: %d%n",product);
		
		int sum = (num1+num2+num3+num4+num5);
		System.out.printf("The sum of the numbers is: %d%n",sum);
		
		int average = (num1+num2+num3+num4+num5)/5;
		System.out.printf("The average of the numbers is: %d%n",average);
		
		
	}
}