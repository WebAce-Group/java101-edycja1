import java.util.Arrays;
import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        Arrays.fill(tablica1, 0);

        int[] tablica2 = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 liczb");
        for (int i = 0;i<10;i++) {
            tablica2[i] = scanner.nextInt();
        }

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        for (int element : tablica1) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int element : tablica2) {
            System.out.print(element + " ");
        }
    }
}
