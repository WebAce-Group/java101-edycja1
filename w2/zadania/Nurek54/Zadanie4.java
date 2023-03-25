package w2.zadania.Nurek54;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        //SWITCH
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer kwartału (1-4): ");
        int kwartal = scanner.nextInt();

        switch (kwartal) {
            case 1:
                System.out.println("I kwartał");
                break;
            case 2:
                System.out.println("II kwartał");
                break;
            case 3:
                System.out.println("III kwartał");
                break;
            case 4:
                System.out.println("IV kwartał");
                break;
            default:
                System.out.println("Nie ma takiego kwartału");
                break;
        }
        //SWITCH EXPRESSION
        System.out.print("Podaj numer dnia tygodnia (1-7): ");
        int dzienTygodnia = scanner.nextInt();

        String dzien = switch (dzienTygodnia) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nie ma takiego dnia tygodnia";
        };

        System.out.println(dzien);
    }
}
