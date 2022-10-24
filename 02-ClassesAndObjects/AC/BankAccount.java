public class BankAccount {

    String accountNumber;
    int balance;
    String bankName;
    boolean isSavingsAccount;
    String password;
    
    public void showBalane(){
        System.out.println("Account balance is: " + balance);
    } 
    
    public void showInfo(){
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Bank account is saving account: " + isSavingsAccount);
    }
    
    public void withdraw100(){
        balance = balance - 100;
        System.out.println("New account balance is: " + balance);
    }
}