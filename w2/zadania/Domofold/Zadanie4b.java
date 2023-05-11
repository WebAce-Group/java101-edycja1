import java.util.Scanner;
public class Zadanie4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        scanner.close();

        String dzien = switch (n) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Podaj liczbę z zakresu 1-7";
        };
        System.out.println(dzien);

    }
}