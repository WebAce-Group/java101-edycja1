import java.util.Scanner;
import java.util.Arrays;
public class Zadanie_11 {
    public static void main(String[] args){
        int[]tablica = new int[10];
        Arrays.fill(tablica, 0);
        int[]tablica_dwa = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczby do drugiej tablicy: ");
        for (int i = 0; i < 10; i++) {
            tablica_dwa[i] = scan.nextInt();
        int index = 0;
            System.out.println("Liczby w drugiej tablicy: ");
            System.out.println(tablica_dwa[i]);
        }
        Arrays.sort(tablica);
        Arrays.sort(tablica_dwa);
        System.out.println(tablica);
        System.out.println(tablica_dwa);
    }
}
