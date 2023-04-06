package org.example;

public class KontoBankowe
{
    private long nrKonta;
    private float saldo;
    public KontoBankowe(long nrKonta, float saldo)
    {
        this.nrKonta = nrKonta;
        this.saldo =saldo;
    }
    public void wplac(float ilosc)
    {
        this.saldo +=ilosc;
    }
    public void wyplac(float ilosc)
    {
        this.saldo -=ilosc;
    }

    public void getSaldo()
    {
        System.out.println(saldo);
    }

}
