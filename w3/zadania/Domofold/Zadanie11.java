import java.util.Arrays;
import java.util.Scanner;
class Zadanie11 {
    public static void main(String[] args) { 
        int[] pierwsza = new int[10];
        Arrays.fill(pierwsza, 0);

        int[] druga = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.printf("Podaj liczbę: ");
            druga[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(pierwsza);
        Arrays.sort(druga);
    }

}