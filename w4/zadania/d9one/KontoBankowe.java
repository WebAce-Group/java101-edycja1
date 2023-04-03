package w4.zadania.d9one;

public class KontoBankowe {
    private int numerKonta;
    private double saldo;
    KontoBankowe(int numerKonta, double saldo){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }
    public void depozyt(double ilosc){
        if(ilosc>0)
        saldo += ilosc;
    }
    public void wyplata(double ilosc){
        if(ilosc<=saldo && ilosc>0)
            saldo-=ilosc;
    }
    public double getSaldo(){
        return saldo;
    }


}
