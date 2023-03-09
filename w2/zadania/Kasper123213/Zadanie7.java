import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;
        int iloscLiczb = 0;
        do {
            System.out.println("Podaj nową liczbę");
            liczba = scanner.nextInt();
            suma += liczba;
            iloscLiczb++;
        } while (liczba <= 100);

        System.out.println((double)suma / iloscLiczb);

    }
}
