import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita.");
        int n=scanner.nextInt();
        System.out.println("Liczby od 1 do " + n + ": ");
        for (int i=0;i<n;i++)
            System.out.println(i+1);

        System.out.println();
        System.out.println("Liczby od " + n + " do 1: ");

        for (int i=n;i>0;i--)
            System.out.println(i);

        System.out.println();
        System.out.println("Liczby od 1 do " + n + ", podzielne przez 3 lub 5: ");

        for (int i=0; i<n; i++){
            if ((i+1)%3==0 || (i+1)%5==0) System.out.println(i+1);
        }

        System.out.println();
        System.out.println("Liczby od 1 do " + n + ", podzielne przez 3 lub 5, ale nie jednoczesnie przez oba: ");

        for (int i=0; i<n; i++){
            if (((i+1)%3==0 || (i+1)%5==0) && !((i+1)%3==0 && (i+1)%5==0)) System.out.println(i+1);
        }
    }
}