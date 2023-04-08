import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        switch (liczba)
        {
            case 1, 2, 3:
                System.out.println("Pierwszy kwartal");
                break;
            case 4, 5, 6:
                System.out.println("Drugi kwartal");
                break;
            case 7, 8, 9:
                System.out.println("Trzeci kwartal");
                break;
            case 10, 11, 12:
                System.out.println("Czwarty kwartal");
                break;
            default:
                System.out.println("Liczba spoza zakresu");
        }
        System.out.println("Podaj numer dnia tygodnia");
       int dzien = scanner.nextInt();
        String wynik  = switch (dzien)
                {
            case 1 -> "Poniedzialek";
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Bledny dzien tygodnia";
        };
        System.out.println(wynik);
    }
}