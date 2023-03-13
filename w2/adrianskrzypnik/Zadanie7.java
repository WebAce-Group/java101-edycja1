import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int ilosc = 0;
        int liczba;

        do {
            System.out.println("Podaj liczbę całkowitą:");
            liczba = scanner.nextInt();

            if (liczba > 0) {
                suma += liczba;
                ilosc++;
            }
        } while (liczba <= 100);

        double srednia = (double) suma / ilosc;
        System.out.println("Średnia arytmetyczna: " + srednia);


        double srednia2 = (double) (suma-liczba) / ilosc;
        System.out.println("Średnia arytmetyczna nie uwzględniejąc liczby >100: " + srednia2);
    }
}