import java.sql.Array;
import java.lang.Math.*;
import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int num, counter = 0;
//      add values to array
        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt();
            arr[i] = num;
        }
//      print each element in array to the power of index value
        for (int element : arr) {
            System.out.print(Math.pow(element, counter) + " ");
            counter++;
        }
    }
}
