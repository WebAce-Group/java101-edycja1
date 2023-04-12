

public class Zadanie16 {
    public static void main(String args[])
    {
        KontoBankowe k1 = new KontoBankowe(123, 500);

        k1.wplac(10);

        System.out.println(k1.getSaldo());
    }

    public static class KontoBankowe
    {
        private int numerKonta;
        private float saldo;

        KontoBankowe(int numerKonta, float saldo)
        {
            this.numerKonta = numerKonta;
            this.saldo = saldo;
        }
        
        public void wplac(float kwota)
        {
            saldo += kwota;
        }

        public void wyplac(float kwota)
        {
            saldo -= kwota;
        }

        public float getSaldo()
        {
            return saldo;
        }
    };
}
