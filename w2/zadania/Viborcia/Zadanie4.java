package w2.zadania.Viborcia;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, a dowiesz sie, w ktorym kwartale sie znajduje:");
        int liczba = scanner.nextInt();

        switch (liczba){
            case 1,2,3:
                System.out.println("Pierwszy kwartal.");
                break;
            case 4,5,6:
                System.out.println("Drugi kwartal.");
                break;
            case 7,8,9:
                System.out.println("Trzeci kwartal.");
                break;
            case 10,11,12:
                System.out.println("Czwarty kwartal.");
                break;
            default:
                System.out.println("Nie pasuje do zadnego kwartalu.");
        }

        System.out.println("Podaj liczbe, a dowiesz sie jaki dzien tygodnia jej odpowiada:");
        int tydzien = scanner.nextInt();

        String wynik = switch (tydzien) {
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
                yield "Nieznany dzien tygodnia. ";
        };
        System.out.println(wynik);
    }
}
