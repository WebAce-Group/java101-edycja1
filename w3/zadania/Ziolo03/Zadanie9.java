package w3.zadania.Ziolo03;
import java.util.Scanner;
import static java.lang.Math.*;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Podaj liczby");
        for (int i=0;i < 10 ;i++){
            tablica[i] = sc.nextInt();
        }
        int y = 0;
        for (int x : tablica) {
            System.out.println(pow(x, y));
            y++;
        }
    }
}
