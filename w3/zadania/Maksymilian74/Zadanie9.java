package w3.zadania.Maksymilian74;
import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i=0;
        for(int liczba : tab) {
            System.out.print("Podaj liczbę: ");
            tab[i] = scanner.nextInt();
            i++;
        }
        i=0;
        for(int liczba : tab)
            System.out.println(Math.pow(liczba,i++));
    }
}
