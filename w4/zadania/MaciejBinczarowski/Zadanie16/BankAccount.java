public class BankAccount
{
    private final String accountNumber;
    private double balance;

    public BankAccount(final String accountNumber, final double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(final double amount)
    {
        this.balance += amount;
    }

    public void withdraw(final double amount)
    {
        this.balance -= amount;
    }

    public double getBalance()
    {
        return this.balance;
    }
}