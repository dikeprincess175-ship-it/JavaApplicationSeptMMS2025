package AbstractionAssignment;


public class MainAccount {
    public static void main(String[] args) {
    System.out.println("=============== SAVINGS ACCOUNT ==================");
    SavingsAccount savingsAccount = new SavingsAccount("1234567","Dike Hopeson Princess",949320);
    savingsAccount.withdraw(245.00);
    savingsAccount.deposit(34);
    savingsAccount.calculateInterest();
    savingsAccount.displayBalance();
    
    System.out.println("=============== CURRENT ACCOUNT ==================");
    CurrentAccount currentAccount = new CurrentAccount("23456765432","Lily Jones",345634);
    currentAccount.withdraw(242.00);
    currentAccount.deposit(30);
    currentAccount.calculateInterest();
    currentAccount.displayBalance();
    
    
    
    
    
}
}
