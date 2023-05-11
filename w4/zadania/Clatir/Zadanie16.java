import com.sun.security.jgss.GSSUtil;

public class Zadanie16 {

    public static class KontoBankowe
    {
        private int numerKonta,saldo;

        public KontoBankowe(int numerKonta, int saldo)
        {
            this.numerKonta = numerKonta;
            this.saldo = saldo;
        }

        public int stanKonta() {return saldo;}
        public void wplata(int kwota) {saldo+=kwota;}

        public void wyplata(int kwota)
        {
            if (kwota<stanKonta()) saldo-=kwota;
            else System.out.println("Nie masz takiej kwoty na koncie");
        }
    }

}
