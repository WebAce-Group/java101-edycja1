package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);

        int[] tab2 = new int[10];
        for(int i=0;i<10;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę:");
            tab2[i] = scanner.nextInt();
        }

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        System.out.println(" ");
        System.out.println("Posortowana tablica 1: ");
        for(int i=0;i<10;i++){
            System.out.print(tab1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Posortowana tablica 2: ");
        for(int i=0;i<10;i++){
            System.out.print(tab2[i]+ " ");
        }

        int[] tab3 = new int[20];
        for(int i=0;i<10;i++){
            tab3[i]=tab1[i];
        }
        for(int i=10;i<20;i++){
            tab3[i]=tab2[i-10];
        }
        Arrays.sort(tab3);

        System.out.println(" ");
        System.out.println("Posortowane obie tablice razem: ");
        for(int i=0;i<20;i++){
            System.out.print(tab3[i]+ " ");
        }
    }
}