 import java.util.Scanner;
 public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("============Calculate perimeter of shapes=============");
		System.out.println("Enter 1. for Square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enetr 4. to exit the program");
		
		System.out.print("Enter your choice: ");
		
		int choice = scan.nextInt();
		switch (choice){
			case 1:
					System.out.print("Enter the length of the square");
					int lenOfSquare = scan.nextInt();
					
					perimeter(lenOfSquare);
					System.out.println("==========Thank you🎀=========");
			break;
			
			case 2:
					System.out.print("Enter the length of rectangle: ");
					int lenOfRect = scan.nextInt();
					
					System.out.print("Enter the width of rectangle: ");
					int widthOfRect = scan.nextInt();
					
					perimeter(lenOfRect, widthOfRect);
					System.out.println("==========Thank you=========");
			break;
			
			case 3:
					System.out.print("Enter sideA: ");
					int sideA = scan.nextInt();
					
					System.out.print("Enter sideB: ");
					int sideB = scan.nextInt();
					
					System.out.print("Enter sideC: ");
					int sideC= scan.nextInt();
					
					perimeter(sideA,sideB,sideC);
					System.out.println("==========Thank you=========");
			break;
			default:
						System.out.println("Program Exited, Good Bye.........................");
		}
		
		
	}
	public static void perimeter(int lenOfSquare){
		int perimeterOfSquare = 4 * lenOfSquare;
		
		System.out.printf("The perimeter of the square is %d%n",perimeterOfSquare);
	}
	public static void perimeter(int lenOfRect, int widthOfRect){
		int perimeterOfRect = 2 * (lenOfRect+widthOfRect);
		
		System.out.printf("The perimeter of the rectangle is %d%n",perimeterOfRect);
	}
		public static void perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTriangle = (sideA+sideB+sideC);
		
		System.out.printf("The perimeter of the triangle is %d%n",perimeterOfTriangle);
	}
		
 }
 
