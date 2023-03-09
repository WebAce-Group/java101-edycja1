package w2.zadania.MatiBukowski;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą od 1 do 12: ");
        int a = scanner.nextInt();

        switch(a){
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
                System.out.println("Błędna liczba");
        }

        System.out.print("\n" + "Podaj drugą liczbę całkowitą od 1 do 7: ");
        int b = scanner.nextInt();

        String wynik = switch(b) {
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
                yield "Błędna liczba";
        };
        System.out.println(wynik);
    }
}


