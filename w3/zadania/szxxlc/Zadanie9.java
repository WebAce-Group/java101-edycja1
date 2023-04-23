import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        int i=0;
        for (int e: tab)
        {
            System.out.println("Podaj " + (i+1) + ". element tablicy: ");
            e=scanner.nextInt();
            System.out.println(Math.pow(e,i));
            i++;
        }

    }
}
