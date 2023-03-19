import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] arg){
    //Pierwszy podpunkt zadania 4
        Scanner text = new Scanner(System.in);
        System.out.println("Podaj liczbę odpowiadającą miesiącowi: ");
        int miesiac = text.nextInt();

        switch(miesiac){
            case 1, 2, 3:
                System.out.println("1 Kwartał");
                break;
            case 4, 5, 6:
                System.out.println("2 Kwartał");
                break;
            case 7, 8, 9:
                System.out.println("3 Kwartał");
                break;
            case 10, 11, 12:
                System.out.println("4 Kwartał");
                break;
            default:
                System.out.println("Podana liczba nie odpowiada żadnemu miesiącowi");
        }
    //-------------------------------------------------------------
    //Drugi podpunkt zadania 4
        System.out.println("Podaj liczbę odpowiadającą dniu tygodnia");
        int dzien = text.nextInt();

        String dzienTygodnia = switch (dzien){
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Podana liczba nie odpowiada żadnemu miesiącowi";
        };

        System.out.println(dzienTygodnia);
    }
}
