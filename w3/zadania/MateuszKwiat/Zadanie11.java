import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int[] arr1 = new int[SIZE];
        int[] arr2 = new int[SIZE];

        Arrays.fill(arr1, 0);
        for (int i = 0; i < SIZE; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int x : arr1) {
            System.out.print(x);
            System.out.print('\t');
        }

        System.out.println();
        for (int x : arr2) {
            System.out.print(x);
            System.out.print('\t');
        }
    }
}
