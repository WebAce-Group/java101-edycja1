import java.util.Scanner;
import java.lang.Math;
public class zadanie9 {
    public static void main(String[] args){
        int[] tablica = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            tablica[i] = (int) Math.pow(liczba, i);
        }
        for(int i: tablica){
            System.out.println(i);
        }
    }
}
