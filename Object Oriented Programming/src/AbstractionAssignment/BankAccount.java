
package AbstractionAssignment;

public abstract class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    private int amount;

    public BankAccount(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        double newBalance = (balance + amount);
        System.out.println("For deposit:");
        System.out.println("The amount deposited is : "+amount);
        System.out.println("The new balance is : "+newBalance);
        balance = newBalance;
        System.out.println("...............................\n");


    }
    void displayBalance(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Your balance is : "+balance);
        System.out.println("...............................\n\n\n");

    }
    abstract void withdraw(double amount);
    abstract void calculateInterest();
}
