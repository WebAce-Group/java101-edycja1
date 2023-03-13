import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita odpowiadajaca miesiacowi. ");
        int x=scanner.nextInt();
        switch(x)
        {
            case 1:
            case 2:
            case 3:
                System.out.println("I kwartal");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("II kwartal");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("III kwartal");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("IV kwartal");
                break;
            default:
                System.out.println("Niepoprawnie podany miesiac!");
                break;
        }
        System.out.println("Podaj liczbe calkowita odpowiadajaca dniu tygodnia.");
        x=scanner.nextInt();
        String wynik= switch (x) {
            case 1:
                yield "poniedzialek";
            case 2:
                yield "wtorek";
            case 3:
                yield "sroda";
            case 4:
                yield "czwartek";
            case 5:
                yield "piatek";
            case 6:
                yield "sobota";
            case 7:
                yield "niedziela";
            default:
                yield "Niepoprawnie podany dzien tygodnia!";
        };
        System.out.println(wynik);
    }
}