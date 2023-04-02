public class Zadanie16 {
    public static void main(String[] args) {
        class KontoBankowe{
            private int numerKonta;
            private double saldo;

            KontoBankowe(int n, double s){
                numerKonta = n;
                saldo = s;
            }
            public void wplac(double kwota){
                saldo += kwota;
            }
            public void wyplata(double kwota){
                saldo -= kwota;
            }
            public double stanKonta(){
                return saldo;
            }
        }
        KontoBankowe konto = new KontoBankowe(00001, 101);
        konto.wplac(200);
        konto.wyplata(50);
        System.out.println(konto.stanKonta());
    }
}
