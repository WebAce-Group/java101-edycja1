import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica1 = new int[10];
        Arrays.fill(tablica1, 0);
        int[] tablica2 = new int[10];
        for (int i = 0; i<10; i++){
            System.out.print("Podaj liczbe: ");
            int k = scanner.nextInt();
            tablica2[i] = k;
        }
        scanner.close();

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);
        
    }
}
