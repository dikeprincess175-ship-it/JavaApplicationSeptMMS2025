public class OperatorPart1{
	public static void main(String[] args){
		//Assignment Operator(=)
		int num = 200;
		System.out.printf("The value of num is %d%n", num);
		
		System.out.print("");
		System.out.println("===============================");
		
		//Arithemtic Operator(+,-,/,*,%)
		int num1 = 80;
		int num2 = 100;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		double division =(double) num1/num2;
		int multiplication = num1 * num2;
		int remainder = num1 % num2;
		
		System.out.printf("%d + %d = %d%n", num1,num2,addition);
		System.out.printf("%d - %d = %d%n", num1,num2,subtraction);
		System.out.printf("%d / %d = %.1f%n", num1,num2,division);
		System.out.printf("%d * %d = %d%n", num1,num2,multiplication);
		System.out.printf("%d %% %d = %d%n", num1,num2,remainder);
		System.out.print("");
		System.out.println("===============================");
		
		
		//Compound Assignment Operators(+=,*=,/=,-=,%=)
		
		num1 += num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
	}
}
		
		
		System.out.printf("");
		System.out.println("======================")
		
		int number1 = 15;
		int number2 = 30;
		int number3 = 25;
		
		boolean isGreater = number1 > number2;
		boolean isLessThan = number1 < number2;
		boolean isGreaterorEqualTo = number1 >= number2;
		boolean isLessThanorEqualTo = number1 <= number2;
		boolean isEqualTo = number1 == number2;
		boolean isNotEqualTo = number1 < number2;
		
		
		System.out.printf("Is %d > %d: %b%n,number1,number2,isGreater");
		System.out.printf("Is %d > %d: %b%n,number1,number2,isLessThan");
		System.out.printf("Is %d >= %d: %b%n,number1,number2,isGreaterorEqualTo");
		System.out.printf("Is %d <= %d: %b%n,number1,number2,isLessThanorEqualTo");
		System.out.printf("Is %d == %d: %b%n,number1,number2,isEqualTo");
		System.out.printf("Is %d != %d: %b%n,number1,number2,isNotEqualTo");
		
		