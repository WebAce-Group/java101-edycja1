import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nr miesiaca: ");
        int miesiac = scanner.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Puzdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
            default:
                System.out.println("Nie ma takiego miesiaca");
        }
        System.out.println("Podaj nr dnia: ");
        int dzien = scanner.nextInt();
        switch (dzien) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("nr poza zakresem");
        }

    }

}
