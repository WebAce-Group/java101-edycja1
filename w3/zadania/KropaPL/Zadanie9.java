import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj liczbe nr " + (i+1) + " :");
            tablica[i] = scan.nextInt();
        }

        System.out.println("Liczby podniesione do potęgi indeksu");
        int index = 0;
        for (int liczba : tablica) {
            System.out.println(Math.pow(liczba, index));
            index++;
        }
    }
}
