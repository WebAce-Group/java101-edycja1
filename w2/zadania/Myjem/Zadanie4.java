import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int l;
        int i;

        System.out.println("Podaj liczbe w zakresie 1-12");
        l = scanner.nextInt();

        switch (l)
        {
            case 12,1,2:
                System.out.println("Zima");
                break;
            case 3,4,5:
                System.out.println("Wiosna");
                break;
            case 6,7,8:
                System.out.println("Lato");
                break;
            case 9,10,11:
                System.out.println("Jesien");
                break;
            case 69:
                System.out.println("hehe");
                break;
            default:
                System.out.println("pajacu zla liczbe wpisales");
        }

        System.out.println("Podaj liczbe w zakresie 1-7");
        i = scanner.nextInt();
        String dzien = switch(i){
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
                yield "Pajacu zla liczbe wpisales";
        };
        System.out.println(dzien);

    }
}
