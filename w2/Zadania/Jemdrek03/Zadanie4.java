import java.util.Scanner;
public class Zadanie4 {
    public static void kwartal(int n)
    {
        switch (n)
        {
            case 1:
                System.out.println("Pierwszy kwartal");
                break;
            case 2:
                System.out.println("Pierwszy kwartal");
                break;
            case 3:
                System.out.println("Pierwszy kwartal");
                break;
            case 4:
                System.out.println("Drugi kwartal");
                break;
            case 5:
                System.out.println("Drugi kwartal");
                break;
            case 6:
                System.out.println("Drugi kwartal");
                break;
            case 7:
                System.out.println("Trzeci kwartal");
                break;
            case 8:
                System.out.println("Trzeci kwartal");
                break;
            case 9:
                System.out.println("Trzeci kwartal");
                break;
            case 10:
                System.out.println("Czwarty kwartal");
                break;
            case 11:
                System.out.println("Czwarty kwartal");
                break;
            case 12:
                System.out.println("Czwarty kwartal");
                break;
            default:
                System.out.println("Liczba nie miesci sie w zakresie");
        }
    }

    public static void dzien(int n )
    {
        String wynik = switch (n){
            case 1 -> "poniedzialek";
            case 2 -> "wtorek";
            case 3 -> "sroda";
            case 4 -> "czwartek";
            case 5 -> "piatek";
            case 6 -> "sobota";
            case 7 -> "niedziela";
            default -> "Liczba nie miesci sie w zakresie";
        };
        System.out.println(wynik);


    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z przecdzialu od 1 do 12");
        int n = scanner.nextInt();
        kwartal(n);
        System.out.println("Podaj liczbe z przedzialu od 1 do 7");
        int t = scanner.nextInt();
        dzien(t);


    }
}