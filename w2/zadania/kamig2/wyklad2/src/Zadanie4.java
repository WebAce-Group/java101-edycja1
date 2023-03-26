import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 12:");
        a = scanner.nextInt();
        switch (a){
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
                System.out.println("Liczba nie należy do przedziału od 1 do 12");
                break;
        }
        System.out.println("Podaj liczbe od 1 do 7:");
        a = scanner.nextInt();
        String wynik = switch (a){
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Liczba nie należy do przedziału od 1 do 7";
        };
        System.out.println(wynik);

    }
}
