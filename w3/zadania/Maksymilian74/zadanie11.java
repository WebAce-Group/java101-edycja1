package w3.zadania.Maksymilian74;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        Arrays.fill(tablica1,0);
        Scanner scanner = new Scanner(System.in);
        int[] tablica2 = new int[10];
        int i;
        for(i=0;i<10;i++) {
            System.out.print("Podaj liczbę: ");
            tablica2[i] = scanner.nextInt();
        }

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        System.out.println("Tablica 1: ");
        for(i=0;i<10;i++)
            System.out.println(tablica1[i]);

        System.out.println("Tablica 2: ");
        for(i=0;i<10;i++)
            System.out.println(tablica2[i]);
    }
}
