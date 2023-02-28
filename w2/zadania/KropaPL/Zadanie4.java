import java.util.Scanner;
//switch
//Napisz program, który pobierze od użytkownika liczbę całkowitą i wyświetli na
//ekranie nazwę kwartału odpowiadającego tej liczbie.
//Jeśli użytkownik poda liczbę spoza zakresu 1-12, program powinien
//wyświetlić odpowiedni komunikat.

//switch expression
//Napisz program, który pobierze od użytkownika liczbę całkowitą i
//wyświetli na ekranie dzień tygodnia odpowiadający tej liczbie.
//Jeśli użytkownik poda liczbę spoza zakresu 1-7, program powinien
//wyświetlić odpowiedni komunikat.
public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // switch

        System.out.println("Podaj miesiąc od 1 do 12: ");
        int miesiac = scan.nextInt();

        switch (miesiac) {
            case 1, 2, 3:
                System.out.println("Jest to 1 kwartał");
                break;
            case 4, 5, 6:
                System.out.println("Jest to 2 kwartał");
                break;
            case 7, 8, 9:
                System.out.println("Jest to 3 kwartał");
                break;
            case 10, 11, 12:
                System.out.println("Jest to 4 kwartał");
                break;
            default:
                System.out.println("Podano zły numer miesiąca");
        }

        //switch expression

        System.out.println("Podaj numer dnia tygodnia: ");
        int numer = scan.nextInt();

        String dzień = switch (numer) {
            case 1:
                yield "Poniedziałek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "Środa";
            case 4:
                yield "Czwartek";
            case 5:
                yield "Piątek";
            case 6:
                yield "Sobota";
            case 7:
                yield "Niedziela";
            default:
                yield "Nieznany dzień tygodnia";
        };

            System.out.println("Twój dzień tygodnia to " + dzień + "! :D");

    }


}