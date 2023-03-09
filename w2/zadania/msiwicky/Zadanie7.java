import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int iloscLiczb = 0;
        int liczba;
        do {
            System.out.print("Podaj liczbe: ");
            liczba = scanner.nextInt();
            suma += liczba;
            iloscLiczb++;
        } while (liczba > 100);
        System.out.println("Średnia arytmetyczna: " + ((double) suma / iloscLiczb));
    }