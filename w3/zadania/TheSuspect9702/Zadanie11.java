package w3.zadania.TheSuspect9702;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);
        int[] tab2 = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int a : tab2) {
            System.out.print("Prosze podac liczbe: ");
            a = scan.nextInt();
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
    }
}
