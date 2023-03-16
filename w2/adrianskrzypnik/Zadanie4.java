import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj numer miesiąca (1-12): ");
        int miesiac = input.nextInt();

        switch(miesiac){
            case 1, 2, 3 -> System.out.print("Pierwsze kwartał");
            case 4, 5, 6 -> System.out.print("Drugi kwartał");
            case 7, 8, 9 -> System.out.print("Trzeci kwartał");
            case 10, 11, 12 -> System.out.print("Czwarty kwartał");
            default -> System.out.print("Nie ma takiego miesiąca");
        }

        System.out.print("\nPodaj numer dnia tygodnia (1-7): ");
        int dzien = input.nextInt();

        String wynik = switch (dzien) {
            case 1:
                yield "Poniedziałek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "Środa";
            case 4:
                yield "Czwartek";
            case 5:
                yield "Piątek";
            case 6:
                yield  "Sobota";
            case 7:
                yield "Niedziela";
            default:
                yield "Nieznany dzien tygodnia";
        };
        System.out.print(wynik);
    }
}