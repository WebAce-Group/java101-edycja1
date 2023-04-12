public class KontoBankowe
{
    private int numerKonta;
    private double saldo;
    private int costam;

    public KontoBankowe(int numerKonta, double saldo)
    {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public double Wyplac(double kwota)
    {
        return saldo -= kwota;
    }

    public double Wplac(double kwota)
    {
        return saldo += kwota;
    }

    public double getSaldo()
    {
        return saldo;
    }
}