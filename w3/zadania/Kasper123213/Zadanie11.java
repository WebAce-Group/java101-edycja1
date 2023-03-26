package zadania.Kasper123213;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista1 = new int[10];

        Arrays.fill(lista1, 0);

        int[] lista2 = new int[10];

        for (int i = 0; i < 10; i++) lista2[i] = sc.nextInt();

        Arrays.sort(lista1);
        Arrays.sort(lista2);

    }

}
