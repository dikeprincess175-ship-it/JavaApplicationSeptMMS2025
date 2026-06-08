import java.util.Scanner;

public class ClassWork4{ 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int date;
		
		System.out.print("Enter the date of the week in numbers : ");
		date = input.nextInt();
		
		if (date == 1){
		System.out.print("The date is Sunday");
		}
		
		else if (date == 2){
		System.out.print("The date is Monday");
		}
		
		else if (date == 3){
		System.out.print("The date is Tuesday");
		}
		
		else if (date == 4){
		System.out.print("The date is Wednesday");
		}
		
		else if (date == 5){
		System.out.print("The date is Thursday");
		}
		
		else if (date == 6){
		System.out.print("The date is Friday");
		}
		
		else if (date == 7){
		System.out.print("The date is Saturday");
		}
		
		else{
		System.out.print("Invalid date number inputted");
		}
	}
}