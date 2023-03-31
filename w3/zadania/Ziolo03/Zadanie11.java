package w3.zadania.Ziolo03;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);
        int[] tab2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = scanner.nextInt();
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
    }
}
