class KontoBankowe {
    private String numerKonta;
    private double saldo;

    public KontoBankowe(String numerKonta, double saldo){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplac(double kwota) {
        saldo += kwota;
    }

    public void wyplac(double kwota) {
        saldo -= kwota;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumerKonta() {
        return numerKonta;
    }
}
