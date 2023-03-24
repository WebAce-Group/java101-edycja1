import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiaca:");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("I kwartal");
                break;
            case 2:
                System.out.println("I kwartal");
                break;
            case 3:
                System.out.println("I kwartal");
                break;
            case 4:
                System.out.println("II kwartal");
                break;
            case 5:
                System.out.println("II kwartal");
                break;
            case 6:
                System.out.println("II kwartal");
                break;
            case 7:
                System.out.println("III kwartal");
                break;
            case 8:
                System.out.println("III kwartal");
                break;
            case 9:
                System.out.println("III kwartal");
                break;
            case 10:
                System.out.println("IV kwartal");
                break;
            case 11:
                System.out.println("IV kwartal");
                break;
            case 12:
                System.out.println("IV kwartal");
                break;
            default:
                System.out.println("Nie ma takiego miesiaca");
        }

        System.out.println("Podaj numer dnia tygodnia:");
        int dayNumber = scanner.nextInt();
        String dayOfWeekResult = switch (dayNumber) {
            case 1 -> "poniedzialek";
            case 2 -> "wtorek";
            case 3 -> "sroda";
            case 4 -> "czwartek";
            case 5 -> "piatek";
            case 6 -> "sobota";
            case 7 -> "niedziela";
            default -> "nie ma takiego dnia tygodnia";
        };
        System.out.println(dayOfWeekResult);

    }
}
