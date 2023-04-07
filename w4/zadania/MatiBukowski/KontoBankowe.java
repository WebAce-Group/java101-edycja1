package w4.zadania.MatiBukowski;

public class KontoBankowe {
    private int numerKonta;
    private double saldo;

    KontoBankowe(int numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplacanie(double wplata) {
        saldo += wplata;
    }

    public void wyplacanie(double wyplata) {
        saldo -= wyplata;
    }

    public double getSaldo() {
        return saldo;
    }
}
