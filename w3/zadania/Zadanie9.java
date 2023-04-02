import java.util.Scanner;
import java.lang.Math;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Podjaj " + (i + 1) + " liczbę: ");
            tab[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println(Math.pow(tab[i], i) + " ");
        }
    }
}
