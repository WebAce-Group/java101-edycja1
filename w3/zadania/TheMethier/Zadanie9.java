import java.util.Scanner;
import java.lang.Math;
public class Zadanie9 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<10; i++)
        {
            tab[i] = scanner.nextInt();
        }
        int j=0;
        for (int i : tab)
        {
            System.out.println(Math.pow(i,j));
            j++;
        }
    }
}