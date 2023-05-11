import java.util.InputMismatchException;
import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiąc: ");
        String kwartal;
        String dTyg;
        try {
             switch (scanner.nextInt()) {
                 case 1, 2, 3 :
                     kwartal="I kwartale";
                     break;
                 case 4, 5, 6:
                     kwartal = "II kwartale";
                     break;
                 case 7, 8, 9:
                     kwartal="III kwartale";
                     break;
                 case 10, 11, 12:
                     kwartal="IV kwartale";
                     break;
                 default:
                     kwartal= "Żadnym kwartale, ponieważ nie ma takiego miesiąca";
                     break;
            };
            System.out.println("Ten miesiąc znajduje się w "+kwartal);

            System.out.println("\n Podaj dzień tygodnia");
            dTyg = switch (scanner.nextInt()) {
                case 1 -> "Poniedziałek";
                case 2 -> "Wtorek";
                case 3 -> "Sroda";
                case 4 -> "Czwartek";
                case 5 -> "Piątek";
                case 6 -> "Sobota";
                case 7 -> "Niedziela";
                default -> "Żaden - Podałeś liczbę z spoza zakresu 1-7";
            };
            System.out.println("Podany dzień tygodnia to: "+dTyg);



        } catch (InputMismatchException e) {
            System.out.println("Podane dane nie są liczbą całkowitą");
            System.exit(1);
        }
    }
}
