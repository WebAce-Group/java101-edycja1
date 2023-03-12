import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Podaj numer wybranego kwartalu: ");
        int a = abc.nextInt();
        switch (a){
            case 1, 2, 3:
                System.out.println("I kwartal");
                break;
            case 4, 5, 6:
                System.out.println("II kwartal");
                break;
            case 7, 8, 9:
                System.out.println("III kwartal");
                break;
            case 10, 11, 12:
                System.out.println("IV kwartal");
                break;
            default:
                System.out.println("Nie ma takiego miesiaca");
        }
        System.out.println("Podaj dzien tygodnia");
        int b = abc.nextInt();

        String dzien = switch(b){
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
                yield "Nie ma takiego dnia tygodnia";

        };
        System.out.println("Wybrany dzien tygodnia to:" +dzien);
    }
}
