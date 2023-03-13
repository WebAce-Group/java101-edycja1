package w2.zadania.alekd77;

import java.util.Scanner;

public class Zadanie4 {
    public static int getUserInput() {
        System.out.println("Podaj liczbe calkowita:");
        return new Scanner(System.in).nextInt();
    }

    public static String getQuarterOfYearIdx(int num) {
        String quarterIdx;

        switch (num) {
            case 1, 2, 3 -> quarterIdx = "I";
            case 4, 5, 6 -> quarterIdx = "II";
            case 7, 8, 9 -> quarterIdx = "III";
            case 10, 11, 12 -> quarterIdx = "IV";
            default -> throw new RuntimeException("Podany nr miesiaca jest nieprawidlowy");
        }

        return quarterIdx;
    }

    public static void printCorrespondingQuarterOfYear(int num) {
        try {
            String quarterIdx = getQuarterOfYearIdx(num);
            String message = String.format(
                    "Podany nr miesiaca nalezy do %s kwartalu", quarterIdx);

            System.out.println(message);

        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String getDayOfWeekName(int num) {
        return switch (num) {
            case 1 -> "Poniedzialek";
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> throw new RuntimeException("Podany dzien tygodnia jest nieprawidlowy");
        };
    }

    public static void printCorrespondingDayOfWeek(int num) {
        try {
            String dayOfWeekName = getDayOfWeekName(num);
            String message = String.format(
                    "Odpowiadajacy dzien tygodnia to: %s", dayOfWeekName);

            System.out.println(message);

        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String[] args) {
        int userInput = getUserInput();

        printCorrespondingQuarterOfYear(userInput);
        printCorrespondingDayOfWeek(userInput);
    }
}
