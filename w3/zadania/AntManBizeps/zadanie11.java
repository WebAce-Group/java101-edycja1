import java.util.Scanner;
import java.util.Arrays;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);
        int[] tab2 = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("\nPodaj liczbe nr " + (i+1) + ": ");
            tab2[i] = scanner.nextInt();
        }

        Arrays.sort(tab1);
        Arrays.sort(tab2);
        System.out.print("tab2 = [ ");
        for(int i=0; i<10; i++){
            System.out.print(tab2[i] + " ");
        }
        System.out.print("]\n");
        System.out.print("tab1 = [ ");
        for(int i=0; i<10; i++){
            System.out.print(tab1[i] + " ");
        }
        System.out.print("]");
    }
}
