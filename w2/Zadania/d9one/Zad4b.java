package w2.Zadania.d9one;
import java.util.Scanner;
public class Zad4b {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj libcze:");
        x = scanner.nextInt();
        String wynik = switch(x) {
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
                yield "Podales zla liczbe";
        };
        System.out.println(wynik);
    }
}
