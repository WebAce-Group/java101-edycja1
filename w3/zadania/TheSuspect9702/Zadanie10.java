package w3.zadania.TheSuspect9702;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe 'w': ");
        int w = scan.nextInt();
        System.out.print("Podaj liczbe 'k': ");
        int k = scan.nextInt();
        Integer[][] arr = new Integer[w][k];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++)
                arr[i][j] = i * j;
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        for (int i = 0; i < w; i++)
            Arrays.sort(arr[i], Collections.reverseOrder());
        for (int i = w-1; i >= 0; i--)
            System.out.println(Arrays.toString(arr[i]));
    }
}