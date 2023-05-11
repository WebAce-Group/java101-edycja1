package w2.Zadania.andrzejk00;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita n: ");
        int n = scanner.nextInt();
        // 1 -> n
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println();
        // n -> 1
        for (int i = n; i >= 1 ; i--) {
            System.out.printf("%3d",i);
        }
        System.out.println();
        // 1 -> n, n%3 || n%5
        for (int i = 1; i <=n ; i++) {
            if(i%3 == 0 || i%5 == 0)
                System.out.printf("%3d",i);
        }
        System.out.println();
        // 1 -> n, n%3 || n%5, !(n%3 && n%5)
        for (int i = 1; i <= n; i++) {
            if (!(i%3 == 0 && i%5 == 0)){
                if (i%3 == 0 || i%5 == 0)
                    System.out.printf("%3d",i);
            }

        }
    }
}
