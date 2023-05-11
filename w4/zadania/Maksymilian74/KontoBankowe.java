package w4.zadania.Maksymilian74;
public class KontoBankowe {
    private int numerKonta;
    private double saldo;

    public KontoBankowe(int numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplata(double ile) {
        saldo += ile;
    }

    public void wyplata(double ile) {
        saldo -= ile;
    }

    public double sprawdzSaldo() {
        return saldo;
    }
}

class zad16 {
    public static void main(String[] args) {
        KontoBankowe konto = new KontoBankowe(123456,999881);
        System.out.println("Stan konta: " + konto.sprawdzSaldo());
        konto.wplata(5500);
        System.out.println("Stan konta: " + konto.sprawdzSaldo());
        konto.wyplata(111);
        System.out.println("Stan konta: " + konto.sprawdzSaldo());
    }
}
