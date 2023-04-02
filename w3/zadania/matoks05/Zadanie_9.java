import java.util.Scanner;

public class Zadanie_9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 10 liczb całkowitych:");
        for (int i = 0; i < 10; i++)
            tablica[i] = scan.nextInt();
        int index = 0;
        for (int element : tablica) {
            System.out.println("Twoje liczby podniesione do potegi: ");
            System.out.println(Math.pow(element, index));
            index++;
        }
    }
}
