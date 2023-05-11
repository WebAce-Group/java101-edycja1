import java.util.Scanner;
import java.lang.Math;

public class zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Podaj liczbę nr " + (i+1) + ":");
            tablica[i] = scanner.nextInt();
        }
        for(int j=0; j<10; j++){
            System.out.println("Liczba  " + tablica[j] + " podniesiona do potęgi " + j + " równa się " + (int)Math.pow(tablica[j], j) );
        }
    }
    

}