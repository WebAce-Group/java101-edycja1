import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        int msc;
        Scanner userInterface = new Scanner(System.in);
        msc = userInterface.nextInt();
        switch (msc){
            case 1,2,3:
                System.out.println("Pierwszy kwartał");
                break;
            case 4,5,6:
                System.out.println("drugi kwartał");
                break;
            case 7,8,9:
                System.out.println("trzecio kwartał");
                break;
            case 10,11,12:
                System.out.println("czwarty kwartał");
                break;
            default:
                System.out.println("Podano za dużą liczbę - rok ma 12 msc a nie tyle ile rogal lat");
        }

        int nr-tyg = userInterface.nextInt();
        string day = switch (nr-tyg){
            case 1 -> "Poniedzialek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Podano zbyt duzą liczbe :*";
        }
        System.out.println(day);

    }
}