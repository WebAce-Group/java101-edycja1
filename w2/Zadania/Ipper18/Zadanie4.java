import java.util.Scanner;
public class Zadanie4 {
    public static void main (String [] args)
    {

        switch ((new Scanner(System.in).nextInt()))
        {
            case (1):
                System.out.println("1 kwartał");
                break;
            case (2):
                System.out.println("1 kwartał");
                break;
            case (3):
                System.out.println("1 kwartał");
                break;
            case (4):
                System.out.println("2 kwartał");
                break;
            case (5):
                System.out.println("2 kwartał");
                break;
            case (6):
                System.out.println("2 kwartał");
                break;
            case (7):
                System.out.println("3 kwartał");
                break;
            case (8):
                System.out.println("3 kwartał");
                break;
            case (9):
                System.out.println("3 kwartał");
                break;
            case (10):
                System.out.println("4 kwartał");
                break;
            case (11):
                System.out.println("4 kwartał");
                break;
            case (12):
                System.out.println("4 kwartał");
                break;
            default:
                System.out.println("Liczba poza zakresem");
                break;
        }
        

            String dzienTygodnia = switch (new Scanner(System.in).nextInt())
                    {
                        case (1):
                            yield "Poniedzialek";
                        case (2):
                            yield "Wtorek";
                        case (3):
                            yield "Środa";
                        case (4):
                            yield "Czwartek";
                        case (5):
                            yield "Piątek";
                        case(6):
                            yield "Sobota";
                        case (7):
                            yield "Niedziela";
                        default:
                            yield "Liczba poza zakresem";

                    };
        System.out.println(dzienTygodnia);


    }
}
