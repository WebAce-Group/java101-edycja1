package w2.zadania.Ksromek;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba=scanner.nextInt();

        switch(liczba)
            {
                case 1:
                    System.out.println("Pierwszy kwartał");
                    break;
                case 2:
                    System.out.println("Pierwszy kwartał");
                    break;
                case 3:
                    System.out.println("Pierwszy kwartał");
                    break;
                case 4:
                    System.out.println("Drugi kwartał");
                    break;
                case 5:
                    System.out.println("Drugi kwartał");
                    break;
                case 6:
                    System.out.println("Drugi kwartał");
                    break;
                case 7:
                    System.out.println("Trzeci kwartał");
                    break;
                case 8:
                    System.out.println("Trzeci kwartał");
                    break;
                case 9:
                    System.out.println("Trzeci kwartał");
                    break;
                case 10:
                    System.out.println("Czwarty kwartał");
                    break;
                case 11:
                    System.out.println("Czwarty kwartał");
                    break;
                case 12:
                    System.out.println("Czwarty kwartał");
                    break;
                default:
                    System.out.println("Zła liczba");
                    break;
            }
        //switch expression
        System.out.println("Podaj dzień tygodnia: ");
        int dzien_t=scanner.nextInt();
        String dzien=switch(dzien_t)
                {
                    case 1 -> "Poniedziałek";
                    case 2 -> "Wtorek";
                    case 3 -> "Środa";
                    case 4 -> "Czwartek";
                    case 5 -> "Piątek";
                    case 6 -> "Sobota";
                    case 7 -> "Niedziela";
                    default -> "Nie ma takiego dnia tygodnia";
                };
        System.out.println(dzien);
        }
    }
