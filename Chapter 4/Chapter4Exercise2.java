public class Chapter4Exercise2{
	public static void main(String[] args){
		
	// 4.9a
	For (i = 100, i >= 1, i++) System.out.println(i);
	
	// Error 1: 'For' is capitalized — Java is case-sensitive; it must be lowercase 'for'.
	// Error 2: The for loop header uses commas (,) instead of semicolons (;) to separate the three parts.
	// Error 3: i++ increments i upward, but the condition is i >= 1 — this would loop forever 
	//(upward from 100 always satisfies >= 1). It should be i-- to count down.
	
	// corrected code
	for (i = 100; i >= 1; i--) System.out.println(i);
	
	//4.9b
	switch (value % 2) {
		case 0:
			System.out.println("Even integer");
		case 1:
			System.out.println("Odd integer");
	}

	// Error: case 0 is missing a break statement. If value is even, it falls through and also prints "Odd integer".
	
	// corrected code
	switch (value % 2) {
		case 0:
			System.out.println("Even integer");
			break;  // <-- added
		case 1:
			System.out.println("Odd integer");
	}

	// 4.9c
	for (i = 19; i >= 1; i += 2)
		System.out.println(i);
	
	// Error: i += 2 increments i, but to go from 19 down to 1 we need to decrement. It should be i -= 2.
	
	// corrected code
	for (i = 19; i >= 1; i -= 2)
		System.out.println(i);

	// 4.9d
	counter = 2;
	do {
		System.out.println(counter);
		counter += 2;
	} While (counter < 100);
	
	// Error 1: 'While' is capitalized — must be lowercase 'while'.
	// Error 2: The condition counter < 100 stops before printing 100. Since we want to include 100 (an even number),
	//it should be counter <= 100.

	// corrected code
	counter = 2;
	do {
		System.out.println(counter);
		counter += 2;
	} while (counter <= 100);


	}
}