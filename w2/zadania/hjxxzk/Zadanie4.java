package w2.zadania.hjxxzk;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer miesiaca: ");
        int month = scanner.nextInt();

        System.out.println("Podaj numer dnia tygodnia: ");
        int day = scanner.nextInt();

        switch(month) {
            case 1,2,3 -> System.out.println("Pierwszy kwartal.");
            case 4,5,6 -> System.out.println("Drugi kwartal.");
            case 7,8,9 -> System.out.println("Trzeci kwartal.");
            case 10,11,12 -> System.out.println("Czwarty kwartal.");
            default -> System.out.println("Liczba spoza zakresu miesiecy.");
        }

        String d_name = switch (day) {
            case 1:
                yield "Poniedzialek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "Sroda";
            case 4:
                yield "Czwartek";
            case 5:
                yield "Piatek";
            case 6:
                yield "Sobota";
            case 7:
                yield "Niedziela";
            default:
                yield "Liczba spoza zakresu dni tygodnia.";
        };

        System.out.println(d_name);
    }

}
