public class Chapter4Exercise1{
	public static void main(String[] args){
		// 1a
		i = 1;
		while (i <= 10);
			++i;
		}
		// Error 1: There is a stray semicolon (;) at the end of the while line
		// This makes the while loop body an empty statement, the loop spins forever doing nothing, causing an infinite loop.
		// Error 2: The opening brace { for the while block is missing. Only a closing } is present, which causes a compile error.

		// corrected code
		i = 1;
		while (i <= 10) {
			++i;
		}
		
		// 1b
		for (k = 0.1; k != 1.0; k += 0.1)
			System.out.println(k);
		
		// Error: The condition k != 1.0 uses floating-point equality comparison, which is unreliable. 
		// Due to the way floating-point numbers are represented in binary (IEEE 754), 0.1 cannot be represented exactly.
		// After repeated additions, k may never equal exactly 1.0 — it could jump from 0.9999... to 1.0000...01, causing an infinite loop.

		// corrected code
		for (k = 0.1; k < 1.0; k += 0.1)
			System.out.println(k);
		
		// 1c
		switch (n) {
			case 1:
				System.out.println("The number is 1");
			case 2:
				System.out.println("The number is 2");
				break;
			default:
				System.out.println("The number is not 1 or 2");
				break;
		}
		
		// Error: case 1 is missing a break statement. Without break, execution falls through into case 2 after printing 
		// "The number is 1". So if n == 1, both "The number is 1" AND "The number is 2" will be printed.
		
		// corrected code
		switch (n) {
			case 1:
				System.out.println("The number is 1");
				break;  // <-- added
			case 2:
				System.out.println("The number is 2");
				break;
			default:
				System.out.println("The number is not 1 or 2");
				break;
		}
		
		// 1d
		n = 1;
		while (n < 10)
			System.out.println(n++);
		
		// Error: The condition is n < 10 but it should be n <= 10. Since n++ is post-increment, 
		// n is printed first and then incremented. With n < 10, the loop runs while n is 1 through 9, 
		// so only 1–9 are printed. The value 10 is never printed.

		// corrected code
		n = 1;
		while (n <= 10)
			System.out.println(n++);
		}
		
	}




