
package AbstractionAssignment;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        double newBalance = (balance - amount);
        System.out.println("For withdrawal:");
        System.out.println("The amount withdrew is : "+amount);
        System.out.println("The new balance is : "+newBalance);
        balance = newBalance;
        System.out.println("...............................\n");

    }
    
    @Override
    void calculateInterest() {
        double interest = (0.04 * balance);
        System.out.println("For withdrawal:");
        System.out.println("The balance is : "+balance);
        System.out.println("The interest is : "+interest);
        System.out.println("...............................\n");


    }
    
}
