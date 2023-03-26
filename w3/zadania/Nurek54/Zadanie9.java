package w3.zadania.Nurek54;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < 10; i++) {
            tablica[i] = scanner.nextInt();
        }

        System.out.println("Wartości elementów tablicy podniesione do potęgi ich indeksu:");
        int indeks = 0;
        for (int element : tablica) {
            System.out.println(element + " ^ " + indeks + " = " + Math.pow(element, indeks));
            indeks++;
        }
    }
}
