import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int[] arr = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = scanner.nextInt();
        }

        int p = 0;
        for (int x : arr) {
            System.out.println(Math.pow(x,p++));
        }
    }
}