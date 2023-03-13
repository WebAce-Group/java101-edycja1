package w2.zadania.Maksymilian74;
import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowitą dodatnią");
        int n = scanner.nextInt();
        int i;
        System.out.println("Liczby od 1 do n: ");
        for(i=1;i<=n;i++)
            System.out.println(i);

        System.out.println("Liczby od n do 1: ");
        for(i=n;i>0;i--)
            System.out.println(i);

        System.out.println("Liczby od 1 do n podzielne przez 3 lub 5: ");
        for(i=1;i<=n;i++)
            if((i%3==0) || (i%5==0))
                System.out.println(i);

        System.out.println("Liczby od 1 do n podzielne przez 3 lub 5, ale nie jednocześnie: ");
        for(i=1;i<=n;i++)
            if(((i%3==0) || (i%5==0)) && (i%15!=0))
                System.out.println(i);
    }
}
