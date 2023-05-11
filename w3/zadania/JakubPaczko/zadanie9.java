import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = text.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) Math.pow(tab[i], i);
            System.out.println(tab[i]);
        }

    }
}
