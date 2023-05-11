package w4.zadania.Viborcia;

public class KontoBankowe {
    private int numerKonta;
    private double saldo;
    KontoBankowe(int numerKonta, double saldo){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplacanie(double kwota) {
        saldo+=kwota;
    }

    public void wyplacanie(double kwota) {
        saldo-=kwota;
    }

    public double getSaldo(){
        return saldo;
    }
}
