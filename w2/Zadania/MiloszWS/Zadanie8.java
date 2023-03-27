package w2.Zadania.MiloszWS;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args)
    {
        Scanner Liczba = new Scanner(System.in);
        for (int i=0;i<=100;i++)
        {
            if (i%3==0)
            {
                System.out.println(i);
            }
            else if (i==50)
            {
                break;
            }
        }
    }

}
