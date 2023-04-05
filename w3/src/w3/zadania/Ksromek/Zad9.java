package w3.zadania.Ksromek;
import java.util.Scanner;
import java.lang.Math;
public class Zad9
{
    public static void main(String[] args) {
        int[] Tab = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            Scanner scan = new Scanner(System.in);
            Tab[i] = (scan.nextInt());
            System.out.println("Liczba podniesiona do potęgi indeksu: " + Math.pow(Tab[i], i));
        }
    }
}
