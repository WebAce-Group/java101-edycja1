class KontoBankowe
{
private String numerkonta;
private float saldo;
public KontoBankowe(String numerkonta)
{
    this.numerkonta=numerkonta;
    this.saldo=0;
}
public void wpłać(float kwota)
{
    saldo+=kwota;

}
public void wypłać(float kwota)
{
        saldo-=kwota;
}
public void pokazstankonta()
    {
        System.out.println("Stan konta: "+saldo+"zł");
    }
    public float getstankonta()
    {
        return saldo;
    }
}
public class Zadanie16 {
    public static void main(String[] args)
    {
        KontoBankowe kontobankowe=new KontoBankowe("10101010101");
        kontobankowe.wpłać(9000);
        kontobankowe.pokazstankonta();
        kontobankowe.wypłać(200);
        kontobankowe.pokazstankonta();
        kontobankowe.wypłać(10000);
        kontobankowe.pokazstankonta();



    }
}