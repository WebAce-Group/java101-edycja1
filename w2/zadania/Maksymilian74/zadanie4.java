package w2.zadania.Maksymilian74;
import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer mieisąca: ");
        int miesiac = scanner.nextInt();
        System.out.println("Nazwa miesiąca: ");
        switch (miesiac) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Podana liczba jest nieprawidłowa");
        }

        System.out.println("Nazwa kwartału: ");
        switch (miesiac) {
            case 1,2,3:
                System.out.println("Kwartał I");
                break;
            case 4,5,6:
                System.out.println("Kwartał II");
                break;
            case 7,8,9:
                System.out.println("Kwartał III");
                break;
            case 10,11,12:
                System.out.println("Kwartał IV");
                break;
            default:
                System.out.println("Podana liczba jest nieprawidłowa");
        }

        System.out.println("Podaj numer dnia tygodnia: ");
        int dzien = scanner.nextInt();
        String dzienTygodnia = switch (dzien) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nie ma takiego dnia tygodnia";
        };

        System.out.println("Dzień tygodnia: ");
        System.out.println(dzienTygodnia);
    }
}
