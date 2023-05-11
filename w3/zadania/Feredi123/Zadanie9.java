import java.util.Scanner;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];

        for ( int i = 1;i<11;i++){
            System.out.println("podaj liczbę nr " + i);
            tablica[i-1] = scanner.nextInt();
        }

        for ( int i : tablica ){
            System.out.println(i*i);
        }
    }
}
