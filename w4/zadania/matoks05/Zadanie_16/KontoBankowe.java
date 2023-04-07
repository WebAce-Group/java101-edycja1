package Zadanie_16;

public class KontoBankowe {

    private String numerKonta;
    private double saldo;

    public KontoBankowe(String numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void Wplacanie(double ilosc_pieniedzy){
        saldo += ilosc_pieniedzy;
    }
    public void Wybieranie(double ilosc_pieniedzy){
        saldo -= ilosc_pieniedzy;
    }
    public double getSaldo(){
        return saldo;
    }

}
