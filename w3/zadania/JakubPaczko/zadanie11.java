import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int[] tab1 = new int[10];

        Arrays.fill(tab1, 0);

        int[] tab2 = new int[10];

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = text.nextInt();
        }

        Arrays.sort(tab1);
        Arrays.sort(tab2);


        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab1[i]);
        }

        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + ", ");
        }

    }
}
