import java.util.Scanner;
import java.lang.Math;
class Zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.printf("Podaj liczbę typu int: ");
            tablica[i] = scanner.nextInt();
        }
        scanner.close();
        int i = 0;
        for (int liczba: tablica) {
            System.out.println(Math.pow(liczba, i));
            i++;
        }

    }
}