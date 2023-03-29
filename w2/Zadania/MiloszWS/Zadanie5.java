package w2.Zadania.MiloszWS;
import java.util.Scanner;


public class Zadanie5 {
    public static void main(String[] args) {
        Scanner Liczba = new Scanner(System.in);
        System.out.println("Prosze podac liczbe: ");
        int n = Liczba.nextInt();

        System.out.println("Podpunkt a:");
        for (int i=1;i<=n;i++)
        {
            System.out.println(i);
        }

        System.out.println("Podpunkt b:");
        for (int i=n;i>=1;i--)
        {
            System.out.println(i);
        }

        System.out.println("Podpunkt c:");
        for (int i=1;i<=n;i++)
        {
            if (i % 3 == 0  || i%5==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Podpunkt d:");
        for (int i=1;i<=n;i++)
        {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0))
            {
                System.out.println(i);
            }
        }

    }
}
