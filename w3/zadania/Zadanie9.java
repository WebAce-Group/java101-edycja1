import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Zadanie9 {

    public static void main(String[] args)
    {
        int[] tab = new int[10];
        Scanner scan = new Scanner(System.in);

        for( int i =0; i <10; i++)
        {
            System.out.println("Podaj wartosć "+i);
            tab[i] = (int) Math.pow(scan.nextInt(),i);
        }

        for (int i : tab)
        {
            System.out.println(i);
        }
    }
}