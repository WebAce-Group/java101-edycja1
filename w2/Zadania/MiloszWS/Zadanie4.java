package w2.Zadania.MiloszWS;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner kwartal = new Scanner(System.in);
        System.out.println("Prosze podac liczbe od 1 do 12: ");
        int miesiac = kwartal.nextInt();

        switch (miesiac){
            case 1, 2, 3:
                System.out.println("Kwartal 1");
                break;
            case 4, 5, 6:
                System.out.println("Kwartal 2");
                break;
            case 7, 8, 9:
                System.out.println("Kwartal 3");
                break;
            case 10, 11, 12:
                System.out.println("Kwartal 4");
                break;
            default:

        }

        Scanner tydzian = new Scanner(System.in);
        System.out.println("Prosze podac liczbe od 1 do 7: ");
        int tydzien = tydzian.nextInt();
        String wynik = switch (tydzien) {
            case 1:
                yield "Poniedziałek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "Środa";
            case 4:
                yield "Czwartek";
            case 5:
                yield "Piatek";
            case 6:
                yield "Sobota";
            case 7:
                yield "Niedziela";
            default:
                yield "Nieznany miesiąc";
        };

        System.out.println("Wybrany dzien tygodnia to:" +wynik);
    }
}
