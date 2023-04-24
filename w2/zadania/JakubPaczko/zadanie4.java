import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int a = text.nextInt();

        switch (a){
            case 1, 2, 3:
                System.out.printf("Kwartał nr 1");
                break;
            case 4, 5, 6:
                System.out.printf("Kwartał nr 2");
                break;
            case 7, 8, 9:
                System.out.printf("Kwartał nr 3");
                break;
            case 10, 11, 12:
                System.out.printf("Kwartał nr 4");
                break;
            default:
                System.out.printf("Zła liczba");
                break;
        }

        System.out.println("\n");

        int b = text.nextInt();

        String wynik = switch (b){
            case 1:
                yield "poniedzialek";
            case 2:
                yield "wtorek";
            case 3:
                yield "sroda";
            case 4:
                yield "czwartek";
            case 5:
                yield "piatek";
            case 6:
                yield "sobota";
            case 7:
                yield "niedziela";
            default:
                yield "zły nr";

        };
        System.out.println(wynik);

    }

}
