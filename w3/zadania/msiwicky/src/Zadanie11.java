import java.util.Scanner;
import java.util.Arrays;

public class Zadanie11 {
    public static void main(String[] args){
        int[] firstTab = new int[10];
        Arrays.fill(firstTab, 0);
        int[] secondTab = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj elementy drugiej tablicy:");
        for (int i = 0; i < 10; i++)
            secondTab[i] = scanner.nextInt();
        Arrays.sort(firstTab);
        Arrays.sort(secondTab);
        for (int i = 0; i < 10; i++)
            System.out.print(firstTab[i] + " ");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(secondTab[i] + " ");


    }
}
