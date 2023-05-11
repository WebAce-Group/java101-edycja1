public class KontoBankowe {
    private String numerKonta;
    private double saldo;
        
    public KontoBankowe(String numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }
        
    public void wplac(double kwota) {
        saldo += kwota;
    }
        
    public void wyplac(double kwota) {
        if (kwota > saldo) {
             System.out.println("Brak wystarczajacych srodków na koncie.");
        } else {
            saldo -= kwota;
        }
    }
        
    public double pobierzSaldo() {
        return saldo;
    }
    public static void main(String[] args){
        KontoBankowe konto = new KontoBankowe("176468348", 1500.0);
        konto.wplac(250.0);
        konto.wyplac(500.0);
        double saldo = konto.pobierzSaldo();
        System.out.println("Saldo konta: " + saldo);
    }
}
