import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < 10; i++) {
            tablica[i] = scanner.nextInt();
        }
        int indeks = 0;
        for (int liczba : tablica) {
            System.out.println(liczba + " ^ " + indeks + " = " + Math.pow(liczba, indeks));
            indeks++;
        }
    }
}