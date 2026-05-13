public class Chapter2Assignment{
	public static void main(String[] args){
		// 2.3
		// a
		int c, thisIsAVariable, q76354, number;
		// b
		System.out.print("Enter an integer: ");
		// c
		value = input.nextInt();
		// d
		System.out.println("This is a Java program");
		// e
		System.out.printf("%s%n%s%n", "This is a", "Java program");
		// f
		 if (number != 7) 
            System.out.println("The variable number is not equal to 7");
		
		
		// 2.4
		// a
		if (c < 7)
			System.out.println("c is less than 7");
		// b
		if (c >= 7)
			System.out.println("c is equal to or greater than 7");
		
		
		// 2.5
		//a
		// This program calculates the product of three integers
		// b
		Scanner input = new Scanner(System.in);
		// c
		int x, y, z, result;
		// d
		System.out.print("Enter first integer: ");
		// e
		x = input.nextInt();
		// f 
		System.out.print("Enter second integer: ");
		// g 
		y = input.nextInt();
		// h
		System.out.print("Enter third integer: ");
		// i 
		z = input.nextInt();
		// j
		result = x*y*z;
		// k
		System.out.printf("Product is %d%n",result);
		
		
		
		// 2.6
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}




	// 2.8
	// a
	System.out.print("Enter an integer: ");
	// b
	a = b*c
	// c
	// This program performs a sample payroll calculation
	
	
	
	// 2.14
	// a
	System.out.println("1 2 3 4");
	// b 
	System.out.print("1 ");
	System.out.print("2 ");
	System.out.print("3 ");
	System.out.print("4");
	// c 
	System.out.printf("1 2 3 4");
	
	
	
	// 2.15
	import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        System.out.printf("Sum = %d%n", num1 + num2);
        System.out.printf("Product = %d%n", num1 * num2);
        System.out.printf("Difference = %d%n", num1 - num2);
        System.out.printf("Quotient = %d%n", num1 / num2);
    }
}


	// 2.16
	import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is larger");

        if (num2 > num1)
            System.out.println(num2 + " is larger");

        if (num1 == num2)
            System.out.println("These numbers are equal");
    }
}


	
	// 2.17
	import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        int sum = x + y + z;
        int average = sum / 3;
        int product = x * y * z;

        int smallest = x;
        int largest = x;

        if (y < smallest)
            smallest = y;

        if (z < smallest)
            smallest = z;

        if (y > largest)
            largest = y;

        if (z > largest)
            largest = z;

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Average = %d%n", average);
        System.out.printf("Product = %d%n", product);
        System.out.printf("Smallest = %d%n", smallest);
        System.out.printf("Largest = %d%n", largest);
    }
}



	// 2.25
	if (number %2 == 0)
		System.out.println("Even");
	else
		System.out.println("Odd");
	
	
	
	// 2.26
	if (first % second == 0)
		System.out.println("First is a multiple of second");
	else
		System.out.println("First is not a multiple of second");
	
	
	// 2.29
	System.out.printf("The character %c has the value %d%n",'A',(int)'A');

	}
}