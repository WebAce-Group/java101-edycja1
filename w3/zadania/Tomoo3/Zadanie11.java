package w3.zadania.Tomoo3;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        int[] tablica = new int[10];
        Arrays.fill(tablica, 0);

        int[] tab = new int[10];
        System.out.println("Podaj 10 liczb:");
        for(int i=0; i<10; i++) {
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            tab[i] = liczba;
        }
        Arrays.sort(tablica);
        Arrays.sort(tab);
    }
}
