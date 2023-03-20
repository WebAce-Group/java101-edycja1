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
            tab[i] = scan.nextInt();
        }

        for (int i : tab)
        {
            System.out.println(Math.pow(i, Arrays.binarySearch(tab,i)));
        }



    }
}
