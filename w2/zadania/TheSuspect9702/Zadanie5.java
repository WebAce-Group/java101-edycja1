package w2.zadania.TheSuspect9702;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = scan.nextInt();
        for (int i = 1; i<=n; i++)
            System.out.println(i);
        for (int i = n; i>=1; i--)
            System.out.println(i);
        for (int i = 1; i<=n; i++){
            if (i%3==0 || i%5==0)
                System.out.println(i);
        }
        for (int i = 1; i<=n; i++){
            if ((i%3==0 || i%5==0) && i%15!=0)
                System.out.println(i);
        }
    }
}
