public class KontoBankowe {
    private String numerKonta;
    private double saldo;
    KontoBankowe(String numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }
    public void deposit(double amount) {
        saldo += amount;
    }
    public void withdraw(double amount) {
        if (amount < saldo) {
            saldo -= amount;
        } else {
            System.out.println("Brak wystarczajacych srodkow na koncie");
        }
    }
    public double getSaldo() {
        return saldo;
    }

}