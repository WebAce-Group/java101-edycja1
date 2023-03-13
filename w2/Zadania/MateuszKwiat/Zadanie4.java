import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba z zakresu 1-12:");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 2, 3:
                System.out.println("I kwartal.");
                break;
            case 4, 5, 6:
                System.out.println("II kwartal.");
                break;
            case 7, 8, 9:
                System.out.println("III kwartal.");
                break;
            case 10, 11, 12:
                System.out.println("IV kwartal.");
                break;
            default:
                System.out.println("Liczba spoza zakresu 1-12.");
        }

        System.out.println("Liczba z zakresu 1-7:");
        int day = scanner.nextInt();
        String dayStr = switch (day) {
            case 1 -> "Poniedzialek";
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Liczba spoza zakresu 1-7.";
        };

        System.out.println(dayStr);
    }
}
