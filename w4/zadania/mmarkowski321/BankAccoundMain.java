package w4.zadania.mmarkowski321;

public class BankAccoundMain {
    public static void main(String[] args){

        BankAccount account = new BankAccount(123,10);
        account.deposit(1);
        account.withdraw(50);
        System.out.println(account.getCurrentBalance());
    }
}
