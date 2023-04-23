import java.util.Scanner;
import java.util.Arrays;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        Arrays.fill(tablica,0);
        int[] tablica2 = new int[10];
        System.out.println("Podaj 10 liczb calkowitych \n ");
        for(int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            tablica2[i] = n;
        }
        Arrays.sort(tablica);
        Arrays.sort(tablica2);

    }
}