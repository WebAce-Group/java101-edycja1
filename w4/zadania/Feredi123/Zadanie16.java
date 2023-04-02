package zadania.Feredi123;

public class Zadanie16 {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(123456,1001.11);
        System.out.println(kontoBankowe.getSaldo());
        kontoBankowe.wyplac(100.11);
        System.out.println(kontoBankowe.getSaldo());
        kontoBankowe.wplac(15);
        System.out.println(kontoBankowe.getSaldo());
    }
}

class KontoBankowe {

    private int numerKonta;
    private double saldo;

    KontoBankowe(int numerKonta,double saldo){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplac(double wpłata){
        this.saldo += wpłata;
    }

    public void wyplac(double wypłata){
        this.saldo -= wypłata;
    }

    public double getSaldo() {
        return saldo;
    }
}
