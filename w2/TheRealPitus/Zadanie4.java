import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiac: ");
        int a = scanner.nextInt();
        System.out.println("Podaj dzien tygodnia: ");
        int b = scanner.nextInt();
        switch(a)
        {
            case 1, 2, 3 -> System.out.println("1 kwartal");
            case 4, 5, 6 -> System.out.println("2 kwartal");
            case 7, 8, 9 -> System.out.println("3 kwartal");
            case 10, 11, 12 -> System.out.println("4 kwartal");
            default -> System.out.println("Zle podany miesiac");
        };
        String dzienTyg = switch(b)
                {
                    case 1 -> "Poniedzialek";
                    case 2 -> "Wtorek";
                    case 3 -> "Sroda";
                    case 4 -> "Czwartek";
                    case 5 -> "Piatek";
                    case 6 -> "Sobota";
                    case 7 -> "Niedziela";
                    default -> "Zle podany dzien";
                };
        System.out.println(dzienTyg);
    }
}