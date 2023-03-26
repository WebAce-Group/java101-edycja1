import java.util.Scanner;

class Zadanie4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Zima chyba");
                break;
            
            case 2:
                System.out.println("Zima chyba");
                break;

            case 3:
                System.out.println("Zima chyba");
                break;

            case 4:
                System.out.println("Wiosna");
                break;

            case 5:
                System.out.println("Wiosna");
                break;

            case 6:
                System.out.println("Wiosna");
                break;

            case 7:
                System.out.println("Lato");
                break;

            case 8:
                System.out.println("Lato");
                break;

            case 9:
                System.out.println("Lato");
                break;

            case 10:
                System.out.println("Jesień");
                break;

            case 11:
                System.out.println("Jesień");
                break;

            case 12:
                System.out.println("Jesień");
                break;

            default:
                System.out.println("Nie ma takiego miesiąca, no co Ty");
        }

        
        int liczba = scanner.nextInt();
        String month;
        month = switch(liczba){
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
                yield "Nie właściwa wartość"
        }

        System.out.println(month);

        scanner.close();
    }
}