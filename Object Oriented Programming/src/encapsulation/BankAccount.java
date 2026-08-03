
package encapsulation;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

//    public BankAccount(int accountNumber, String accountHolder, int balance) {
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }

    BankAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double balance){
        balance = balance + balance;
        System.out.println("This is your current account balance after depositing");

    }
    

    public void withdraw(double balance){
        balance = balance - balance;
        System.out.println("This is your current account balance after withdrawing");

    }
    
    

    public void AccountDetails(){
        System.out.println("Account Number"+accountNumber);
        System.out.println("Account Balance"+balance);

    }
}

