package w2.zadania.Viborcia;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dodatnia liczbe calkowita: ");
        int n = scanner.nextInt();
        System.out.println("liczby od 1 do n");
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("liczby od n do 1");
        for(int i=n; i>=1; i--)
        {
            System.out.println(i);
        }
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("liczby od 1 do n, ale tylko te, ktore sa podzielne przez 3 lub 5.");
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 || i%5==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("liczby od 1 do n, ale tylko te, ktore sa podzielne przez 3 lub 5, ale nie jednoczesnie przez obie.");
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                continue;
            }
            else if(i%3==0)
            {
                System.out.println(i);
            }
            else
            {
                if(i%5==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
