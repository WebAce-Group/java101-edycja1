import java.util.Scanner;

public class Zadanie5
{
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbe: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Liczby od 1 do n:");
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
        System.out.println("Liczby od n do 1:");
        for (int i=n; i>0; i--)
        {
            System.out.println(i);
        }
        System.out.println("liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5");
        for(int i=1; i<=n; i++)
        {
            if((i%3==0)||(i%5==0))
            {
            System.out.println(i);
        }
        }
        System.out.println("liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5, ale nie jednocześnie przez oba");
        for (int i=1; i<=n; i++)
        {
            if(i % 3 == 0 ^ i % 5 == 0)
            {
                System.out.println(i);
            }
        }



    }
}
