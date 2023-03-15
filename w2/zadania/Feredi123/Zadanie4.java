import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiąc 1-12");
        int miesiac = scanner.nextInt();
        switch (miesiac){
            case 1,2,3:
                System.out.println("Pierwszy kwartał");
                break;
            case 4,5,6:
                System.out.println("Drugi kwartał");
                break;
            case 7,8,9:
                System.out.println("Trzeci kwartał");
                break;
            case 10,11,12:
                System.out.println("Czwarty kwartał");
                break;
            default:
                System.out.println("liczba spoza zakresu 1-12");
                break;
        }

        System.out.println("Podaj liczbę 1-7");
        int dzien = scanner.nextInt();
        String wynik = switch (dzien){
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
                yield "Liczba z poza zakresu";
        };

        System.out.println(wynik);

    }
}
