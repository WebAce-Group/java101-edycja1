import java.util.Scanner;
import java.util.*;

public class zadanie4 {

    public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj numer miesiąca: ");
            int answer = scanner.nextInt();
            quarterCheck(answer);
            System.out.println("Podaj numer dnia tygodnia: ");
            int day = scanner.nextInt();
            dayOfTheWeek(day);
    }

    static void quarterCheck(int month){
        switch ((month-1)/3) {
            case 0:
                System.out.println("Kwartał pierwszy");              
                break;
            case 1:
                System.out.println("Kwartał drugi"); 
                break;
            case 2:
                System.out.println("Kwartał trzeci");
                break;
            case 3:
                System.out.println("Kwartał czwarty");
                break;
            default:
                System.out.println("Nie ma takiego numeru miesiąca");
                break;
        }
    }

    static void dayOfTheWeek(int n){
        String day = switch (n) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieznany dzień";
        };
        System.out.println(day);
    }

}