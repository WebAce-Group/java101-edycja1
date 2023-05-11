import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] zera = new int[10];
        Arrays.fill(zera, 0);
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbe nr " + (i + 1) + " : ");
            tablica[i] = scan.nextInt();
        }

        Arrays.sort(tablica);
        Arrays.sort(zera);

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}