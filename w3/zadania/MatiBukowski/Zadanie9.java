package w3.zadania.MatiBukowski;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        int a = 0;
        System.out.println("Wpisz liczby do tablicy: ");

        for(int i=0; i<10; i++) {
            tab[i]=scanner.nextInt();
        }

        for(int x: tab) {
            System.out.print(pow(x,a) + " ");
            a++;
        }
    }
}
