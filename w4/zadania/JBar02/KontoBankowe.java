package w4.zadania.JBar02;

public class KontoBankowe {
    //atrybuty klasy Kontobankowe
    private int numerKonta;
    private int saldo;

   public KontoBankowe(int numerKonta, int saldo){
       this.numerKonta=numerKonta;
       this.saldo=saldo;
   }

   public void wplata(int wplata){
        saldo+=wplata;
   }
   public void wyplata(int wyplata){
        saldo-=wyplata;
   }

   public int zobaczSaldo(){
       return saldo;
   }


    public static void main(String[] args){
      KontoBankowe konto = new KontoBankowe(4025, 5);
        System.out.println(konto.zobaczSaldo());
        konto.wplata(1000);
        konto.wyplata(300);
        System.out.println(konto.zobaczSaldo());
    }
}
