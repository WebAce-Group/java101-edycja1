package w4.zadania.Nurek54;

public class KontoBankowe {
    private String numerKonta;
    private double saldo;

    public KontoBankowe(String numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public double pobierzSaldo() {
        return saldo;
    }

    public void wplacPieniadze(double kwota) {
        saldo += kwota;
    }

    public boolean wyplacPieniadze(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
            return true;
        } else {
            return false;
        }
    }
    //Test programu
    public static void main(String[] args) {
        KontoBankowe konto = new KontoBankowe("1234", 1000.0);

        System.out.println("Saldo na koncie: " + konto.pobierzSaldo());

        konto.wplacPieniadze(500.0);
        System.out.println("Saldo po wpłacie: " + konto.pobierzSaldo());

        boolean wyplacono = konto.wyplacPieniadze(2000.0);
        if (wyplacono) {
            System.out.println("Wypłacono 2000 zł, saldo: " + konto.pobierzSaldo());
        } else {
            System.out.println("Brak wystarczających środków na koncie");
        }
    }
}
