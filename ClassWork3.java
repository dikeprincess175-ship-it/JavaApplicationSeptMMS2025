import java.util.Scanner;

public class ClassWork3{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		
        System.out.print("Enter your name: ");
        String name = input.nextLine();  
		
		System.out.print("Enter your address: ");
        String address = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.printf("%nHi %s%n",name);
		System.out.printf("Based on the information given you are %d%nyears old",age);
		System.out.printf(",and you live at %s%n",address);
	}
}