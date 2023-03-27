package w2.zadania.Tomoo3;
import java.util.Scanner;

public class Zadanie4{
    public static void main(String[] args) {
        Scanner liczba1 = new Scanner(System.in);
        System.out.println("Podaj liczbę symbolizującą miesiąc: ");
        int miesiac = liczba1.nextInt();

        switch (miesiac){
            case 1, 2, 3 -> System.out.println("Pierwszy kwartał.");
            case 4, 5, 6 -> System.out.println("Drugi kwartał.");
            case 7, 8, 9 -> System.out.println("Trzeci kwartał.");
            case 10, 11, 12 -> System.out.println("Czwarty kwartał.");
            default -> System.out.println("Nie ma takiego miesiąca.");
        }

        Scanner liczba2 = new Scanner(System.in);
        System.out.println("Podaj liczbę symbolizującą dzień tygodnia: ");
        int tydzien = liczba2.nextInt();

        String wynik = switch(tydzien){
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nie ma takiego dnia tygodnia.";
        };
        System.out.println(wynik);
    }
}
