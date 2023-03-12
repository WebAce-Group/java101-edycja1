import java.util.Scanner;
public class Zadanie4a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nr miesiaca: ");
        int nr_miesiaca = scan.nextInt();
        switch(nr_miesiaca)
        {
            case 1,2,3:
                System.out.println("Pierwszy Kwartal ");
                break;
            case 4,5,6:
                System.out.println("Drugi Kwartal ");
                break;
            case 7,8,9:
                System.out.println("Trzeci Kwartal ");
                break;
            case 10,11,12:
                System.out.println("Czwarty Kwartal ");
                break;
            default:
                System.out.println("Nie mozna znalezc takiego miesiaca  ");
        }
    }
}
