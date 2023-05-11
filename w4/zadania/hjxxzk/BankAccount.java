package w4.zadania.hjxxzk;

public class BankAccount {

    private float account_number;
    private float account_balance;

    public BankAccount  (float account_number, float account_balance)   {

        this.account_number = account_number;
        this.account_balance = account_balance;

    }

    public void deposit(double amount) {
        account_balance += amount;
    }

    public void withdraw(double amount) {
        account_balance -= amount;
    }

    public double getBalance() {
        return account_balance;
    }



}
