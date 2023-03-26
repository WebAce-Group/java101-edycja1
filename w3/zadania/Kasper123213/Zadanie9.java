package zadania.Kasper123213;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            tablica[i] = sc.nextInt();
        }

        int i = 0;
        for (int j : tablica) {
            System.out.println(j + "^" + i + " = " + (int) Math.pow(j, i));
            i++;
        }
    }
}
