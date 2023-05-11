import java.util.Arrays;
import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica1 = new int[10];
        Arrays.fill(tablica1, 0);

        int[] tablica2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj " + (i+1) + " liczbę: ");
            tablica2[i] = scanner.nextInt();
        }

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        System.out.println("Tablica 1: " + Arrays.toString(tablica1));
        System.out.println("Tablica 2: " + Arrays.toString(tablica2));
    }
}