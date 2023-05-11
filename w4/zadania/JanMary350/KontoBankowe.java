package wyklad4;

public class KontoBankowe {
    private float saldo;
    final private String numerKonta;

    public KontoBankowe(float saldo, String numerKonta){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void wplata(float kwota){
        if(kwota>0){
            this.saldo+=kwota;
        }
        else{
            throw new IllegalArgumentException("kwota nie spelnia wymagan");
        }
    }

    public void wyplata(float kwota){
        if(kwota>0 && this.saldo-kwota>=0){
            this.saldo-=kwota;
        }
        else{
            throw new IllegalArgumentException("kwota nie spelnia wymagan lub jest zbyt duza");
        }
    }
}
