import java.util.Scanner;

public class Zadanie4_2 {
    public static void main(String[] args) {
        int x;
        System.out.println("Podaj liczbę z zakresu 1-7:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        String wynik = switch (x) {
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
                yield "Miało być z zakresu 1-7 siermięgo!!!";
        };
        System.out.println(wynik);
    }
}
