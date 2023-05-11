package w3.zadania.Tomoo3;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
public class Zadanie9 {
    public static void main(String[] args){
        int[] tablica = new int[10];
        int i = 0;
        System.out.println("Podaj 10 liczb");
        while(i < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            tablica[i] = liczba;
            i += 1;
        }
        for(int j : tablica){
            //double l = pow(tablica[j-1], j);
            System.out.println(pow(j, Arrays.binarySearch(tablica, j) ));
        }
    }
}
