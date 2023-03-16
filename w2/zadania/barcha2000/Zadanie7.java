import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        double suma = 0;
        int n = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbę całkowitą ");
            i = scanner.nextInt();
            suma += i;
            n += 1;
        } while (i <= 100);
        double wynik = suma / n;
        System.out.println("Średnia to " + wynik);
    }
}