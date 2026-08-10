
package assignment24;

public class MainEncapsulation{

    public static void main(String[] args){
    BankAccount bankaccount = new BankAccount( "4567","me",129345.0);
    
    System.out.println("=========== FOR WITHDRAWAL ============");
    bankaccount.withdraw(21);
    
    System.out.println("============ FOR DEPOSIT ==============");
    bankaccount.deposit(23);

    System.out.println("============ BANK DETAILS ==============");
    bankaccount.displayAccountDetails();
    }
}


