package w2.zadania.MaksymilianWis;
import java.util.Scanner;

public class Zadanie4 {
    class metody
    {
    public static void ktoryKwartal()
    {
        System.out.println("Podaj liczbe calkowita: ");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        switch (n){
            case 1, 2, 3:
            System.out.println("1 kwartal");
            break;
            case 4, 5, 6:
            System.out.println("2 kwartal");
            break;
            case 7, 8, 9:
            System.out.println("3 kwartal");
            break;
            case 10, 11, 12:
            System.out.println("4 kwartal");
            break;
            default:
            System.out.println("liczba z poza zakresu");
        }
        scan.close();
    };
    public static void dzienTygodnia()
        {
                System.out.println("Podaj numer dnia tygodnia: ");
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();

                String wynik = switch(n) {
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
                        yield "Nieznany dzien tygodznia";
                };
                System.out.println("Dzien tygodnia: " + wynik);
                scan.close();
        };
    }
    public static void main(String[] args) {
        metody.dzienTygodnia();
        
    }
}
