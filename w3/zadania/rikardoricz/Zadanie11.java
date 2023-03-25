import java.util.Arrays;
import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int inputNumber;

//        fill both arrays
        Arrays.fill(arr1, 0);
        for (int i = 0; i < 10; i++) {
            inputNumber = scanner.nextInt();
            arr2[i] = inputNumber;
        }
//        sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        print both arrays
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}