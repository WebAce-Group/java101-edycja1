import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz czy chcesz sprawdzic dzialanie switcha 1(expression) czy 2(zwykly) :");
        int a = scanner.nextInt();
        switch(a) {
            case 1: {
                Scanner wybor_1= new Scanner(System.in);
                System.out.println("wybierz miesiac  :");
                int miesiac = wybor_1.nextInt();
                String wynik = switch (miesiac) {
                    case 1 -> "Pierwsze kwartał";
                    case 2 -> "Pierwsze kwartał";
                    case 3 -> "Pierwsze kwartał";
                    case 4 -> "Drugi kwartał";
                    case 5 -> "Drugi kwartał";
                    case 6 -> "Drugi kwartał";
                    case 7 -> "Trzeci kwartał";
                    case 8 -> "Trzeci kwartał";
                    case 9 -> "Trzeci kwartał";
                    case 10 -> "Czwarty kwartał";
                    case 11 -> "Czwarty kwartał";
                    case 12 -> "Czwarty kwartał";
                    default -> "Nie ma takiego miesiąca";
                };
                System.out.println(wynik);
            }
            break;
            case 2: {
                Scanner wybor_2= new Scanner(System.in);
                System.out.println("wybierz miesiac  :");
                int liczba = wybor_2.nextInt();
                switch (liczba) {
                    case 1:
                        System.out.println( "Pierwsze kwartał");
                        break;
                    case 2:
                        System.out.println( "Pierwsze kwartał");
                        break;
                    case 3:
                        System.out.println( "Pierwsze kwartał");
                        break;
                    case 4:
                        System.out.println( "Drugi kwartał");
                        break;
                    case 5:
                        System.out.println( "Drugi kwartał");
                        break;
                    case 6:
                        System.out.println( "Drugi kwartał");
                        break;
                    case 7:
                        System.out.println( "Trzeci kwartał");
                        break;
                    case 8:
                        System.out.println( "Trzeci kwartał");
                        break;
                    case 9:
                        System.out.println( "Trzeci kwartał");
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
                        System.out.println( "nie ma takiego miesiaca :(");
                }
                break;
            }
            default:
                System.out.println("wybrales liczbe inna niz 1 v 2 :");
        }
    }
}

