package w3.zadania.Ksromek;
import java.util.Arrays;
import java.util.Scanner;
public class Zad11
{
    public static void main(String[] args) {
        int[] Tab1 =new int [10];
        Arrays.fill(Tab1, 0);
        int[] Tab2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            Scanner scan = new Scanner(System.in);
            Tab2[i] = (scan.nextInt());
        }
        Arrays.sort(Tab1);
        Arrays.sort(Tab2);
    }
}
