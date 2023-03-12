import java.util.Scanner;
public class Zadanie4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj miesiac: ");
        int miesiac = scanner.nextInt();
        String wynik =switch(miesiac){
            case 1, 2, 3 -> "Pierwszy kwartał";
            case 4, 5, 6 -> "Drugi kwartał";
            case 7, 8, 9 -> "Trzeci kwartał";
            case 10, 11, 12 -> "Czwarty kwartał";
            default -> "Nie ma takiego miesiąca";
        };
        System.out.println(wynik+"\npodaj dzien: ");
        int dzien = scanner.nextInt();
        String w = switch(dzien) {
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
                yield "Nieznany dzień";
        };
        System.out.println(w);
        }
    }
