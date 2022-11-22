public class BankAccount {

    String ownerName;
    String number;
    double balance;
    String type;

    public void transferMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        if (amount <= 500.00) {
            if (amount > balance) {
                System.out.println("You don't have that much money");
            } else {
                balance -= amount;
            }
        } else {
            System.out.println("You can't withdraw more than 500 PLN");
        }

    }

    public void displayBalance() {
        System.out.println("Account balance: " + balance);
    }

    public BankAccount(String ownerName, String number, String type) {
        this.ownerName = ownerName;
        this.number = number;
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Jan", "123", "Private");
        a1.transferMoney(500.00);
        a1.displayBalance();
        a1.transferMoney(200.00);
        a1.displayBalance();
        a1.withdrawMoney(600.00);
        a1.withdrawMoney(300.00);
        a1.withdrawMoney(500.00);
        a1.displayBalance();

    }

}
