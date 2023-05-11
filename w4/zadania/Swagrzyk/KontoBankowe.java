public class KontoBankowe {
    private long numerKonta;
    private double saldo;
    public KontoBankowe(long numer, double kasa){
        this.numerKonta=numer;
        this.saldo=kasa;
    }

    public void wplacanie(long num){
        numerKonta+=num;
    }
    public void wyplacanie(long num){
        if (num > saldo) {
            System.out.println("e no co ty ");
        } else {
            saldo -= num;
        }
    }
    public double getSaldo(){
        return saldo;
    }

    public long getNumerKonta() {
        return numerKonta;
    }
}