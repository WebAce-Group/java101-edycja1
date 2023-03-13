package w2.zadania.Ksromek;
import java.util.Scanner;
public class Zadanie5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę N: ");
        int N=scanner.nextInt();

        System.out.println("Liczby od 1 do N: ");
        for(int i=1; i<=N; i++)
        {
            System.out.println(i);
        }

        System.out.println("Liczby od N do 1: ");
        for(int j=N; j>=1; j--)
        {
            System.out.println(j);
        }

        System.out.println("Liczby od 1 do N podzielne przez 3 lub 5: ");
        for(int i=1; i<=N; i++)
        {
            if(i%3==0 || i%5==0)
            System.out.println(i);
        }

        System.out.println("Liczby od 1 do N podzielne przez 3 lub 5, ale nie przez obie: ");
        for(int i=1; i<=N; i++)
        {
            if((i%3==0 || i%5==0) && i%15!=0)
                System.out.println(i);
        }



    }
}