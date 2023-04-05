package w4.zadania.Ksromek;
public class KontoBankowe {
    private int numerKonta;
    private double saldo;


    public void deposit(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {
        saldo -= amount;
    }

    public double getBalance() {
        return saldo;
    }
    public void main(String[] args) {
        KontoBankowe account = new KontoBankowe();
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.getBalance());
    }
}




