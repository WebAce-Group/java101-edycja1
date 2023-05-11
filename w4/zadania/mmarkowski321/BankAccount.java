package w4.zadania.mmarkowski321;

public class BankAccount {
    private final int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("The operation is not available");
        }else{
            balance-=amount;
        }
    }
    public int getCurrentBalance(){
        return balance;
    }
}
