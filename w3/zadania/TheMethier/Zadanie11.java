import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t1[]=new int [10];
        Arrays.fill(t1,0);
        int t2[]=new int[10];
        for (int i=0;i<10;i++) {
            t2[i] = scanner.nextInt();

        }
        Arrays.sort(t2);
        Arrays.sort(t1);

    }

    }
