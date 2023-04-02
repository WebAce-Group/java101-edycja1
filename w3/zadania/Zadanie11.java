import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);
        Scanner sc = new Scanner(System.in);
        int[] tab2 = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.println("Podjaj " + (i + 1) + " liczbę: ");
            tab2[i] = sc.nextInt();
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        System.out.print("Tablica 1: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        System.out.print("Tablica 2: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(tab2[i] + " ");
        }
    }
}
