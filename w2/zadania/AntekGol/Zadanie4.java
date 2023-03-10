import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj miesiac (liczbe od 1 do 12): ");
        int a = scanner.nextInt();
        switch (a){
            case 1,2,3:
                System.out.print("Pierwszy kwartał" + "\n");
              break;
            case 4,5,6:
                System.out.print("Drugi kwartał" + "\n");
              break;
            case 7,8,9:
                System.out.print("Trzeci kwartał" + "\n");
              break;
            case 10,11,12:
                System.out.print("Czwarty kwartał" + "\n");
              break;
            default:
              System.out.print("Nie podano liczby z zakresu 1-12 " + "\n");
          }

        System.out.print("Podaj dzien tygodnia (liczbe od 1 do 7): ");
        int b = scanner.nextInt();
        String wynik = switch (b) {
            case 1:
                yield "Poniedziałek";
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
                yield "nie podano liczby z zakresu 1-7";
        };
        System.out.print(wynik + "\n");






    }

}
