package w2.zadania.hjxxzk;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę calkowitą: ");
        int n = scanner.nextInt();
        int i = 1;

        for(; i <= n; i++) {

            System.out.println(i + ", ");

        }
        System.out.println(" ");
        for(--i; i > 0; i--) {

            System.out.println(i + ", ");

        }

        System.out.println(" ");
        for(i = 3; i <= n; i++) {

            if((i%3 == 0) || (i%5 == 0))
                System.out.println(i + ", ");

        }
        System.out.println(" ");
        for(i = 3; i <= n; i++) {

            if((i%3 == 0) && (i%5 != 0))
                System.out.println(i + ", ");

            if((i%3 != 0) && (i%5 == 0))
                System.out.println(i + ", ");

        }
    }
}

