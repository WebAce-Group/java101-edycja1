public class KontoBankowe {

    private int numerKonta;
    private double saldo;

    public KontoBankowe(int numerKonta, double saldo)
    {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplata(double kwota){
        if (kwota > 0) {
            saldo += kwota;
        }
    }

    public void wyplata(double kwota) {
        if (kwota <= saldo && saldo > 0) {
            saldo -= kwota;
        }
    }

    public double stanKonta() {
        return saldo;
    }

}
