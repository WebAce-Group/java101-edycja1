class KontoBankowe {
    private int numerKonta;
    private double saldo;
    KontoBankowe(int _numerKonta, double _saldo) {
        numerKonta = _numerKonta;
        saldo = _saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void addMoney(double amount) {
        if (amount > 0)
            saldo += amount;
    }
    public void withdrawMoney(double amount) {
        if (saldo >= amount)
            saldo -= amount;
    }
}
