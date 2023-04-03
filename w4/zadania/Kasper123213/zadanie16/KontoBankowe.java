package zadanie16;

public class KontoBankowe {
    private int numerKonta;
    private float saldo;

    public KontoBankowe(int numerKonta, int saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplac(float suma) {
        saldo += suma;
    }

    public boolean wyplac(float suma) {      //nie bylo to zprecyzowane w poleceniu więc postanowiłam
        if (saldo >= suma) {                 //aby ta metoda zwracała potwierdzenie czy wypłacenie sie udało czy nie.
            saldo -= suma;
            return true;
        } else return false;
    }

    public float wyswietlSaldo() {
        return saldo;
    }
}
