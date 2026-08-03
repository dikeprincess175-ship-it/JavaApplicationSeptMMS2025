import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String name = input.nextLine();
		
		System.out.print("Enter the hours worked: ");
		double hours_worked = input.nextDouble();
		
		System.out.print("Enter the hourly rate : ");
		double hourly_rate = input.nextDouble();
		
		
		System.out.println("=======================================");
		double gross_salary = (hourly_rate*hours_worked);
		System.out.println("The gross salary is " + gross_salary);
		
		double tax = (gross_salary/100 * 10);
		System.out.println("The tax to be payed is " + tax);
		
		double net_salary = (gross_salary-tax);
		System.out.println("The net salary is "+net_salary);
		
		System.out.println("=======================================");
	}
}
































