import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca: ");
        int miesiac = scanner.nextInt();
        switch (miesiac) {
            case 1, 2, 3:
                System.out.println("I kwartał");
                break;
            case 4, 5, 6:
                System.out.println("II kwartał");
                break;
            case 7, 8, 9:
                System.out.println("III kwartał");
                break;
            case 10, 11, 12:
                System.out.println("IV kwartał");
                break;
            default:
                System.out.println("Liczba spoza zakresu 1-12");
        }
        System.out.print("Podaj numer dnia tygodnia: ");
        int dzienTyg = scanner.nextInt();
        String dzienTygNapis = switch (dzienTyg) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Liczba spoza zakresu 1-7";

        };
        System.out.println(dzienTygNapis);

    }
}