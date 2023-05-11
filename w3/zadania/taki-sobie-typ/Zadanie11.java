import java.util.Arrays;
import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args){
        int[] arr = new int[10], arr2 = new int[10];
        Arrays.fill(arr, 0);
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Podaj liczbe: ");
            arr2[1] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
    }
}
