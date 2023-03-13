import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1-12 odpowiadającej miesiącom");
        int miesiac = scanner.nextInt();
        scanner.nextLine();

        String wynik = switch(miesiac){
            case 1,2,3 -> "1 kwartał";
            case 4,5,6 -> "2 kwartał";
            case 7,8,9 -> "3 kwartał";
            case 10,11,12 -> "4 kwartał";
            default -> "Niepoprawny miesiąc";

        };
        System.out.println(wynik);



    }
}
