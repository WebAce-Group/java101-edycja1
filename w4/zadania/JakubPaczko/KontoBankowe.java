public class KontoBankowe {
    private int nrKonta;
    private double saldo;

    KontoBankowe(int _nrKonta, double _saldo){
        nrKonta = _nrKonta;
        saldo = _saldo;
    }

    public void Wplac(double pienondze){
        saldo += pienondze;
    }

    public void Wyplac(double pieniondze){
        if((saldo - pieniondze) <= 0){
            System.out.println("Nie masz tyle pieniendzy na koncie");
            return;
        }
        saldo = saldo - pieniondze;
    }
    public double GetSaldo(){
        return saldo;
    }
}
