package w2.zadania.MaksymilianWis;

public class Zadanie8 {
    class metody{
        public static void forBreakContinue()
        {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i<50 )
            {
                System.out.println("Podzielna przez 3: " + i);
                continue;
            }
            else if(i>=50) break;
        }
        }
    }
    public static void main(String[] args) {
        metody.forBreakContinue();
    }
}
