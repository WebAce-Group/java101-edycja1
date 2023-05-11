package w2.zadania.MaksymilianWis;
import java.util.Scanner;

public class Zadanie5 {
    class metody{

    public static void podzielne()
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj dodatnia liczbe calkowita");
    int n = scan.nextInt();
    scan.close();

    for(int i=1; i<n; i++ ){
        System.out.println(i);
    }
    System.out.println("\n");
    for(int i=n; i>=1; i-- ){
        System.out.println(i);
    }
    System.out.println("\n");
    for(int i=1; i<=n; i++ ){
        if(i%3==0 || i%5==0) System.out.println("liczba: " + i + " jest podzielna przez 3 lub 5");
    }
    System.out.println("\n");
    for(int i=1; i<=n; i++ ){
        if(i%3==0 ^ i%5==0) System.out.println("liczba: " + i + " jest podzielna przez 3 XOR 5");
    }

    }
    }

public static void main(String[] args) {
    metody.podzielne();
}
}