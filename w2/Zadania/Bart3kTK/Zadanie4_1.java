import java.util.Scanner;


public class Zadanie4_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowta od 1 do 12");
        int liczba = scanner.nextInt();
        scanner.close();
        switch (liczba){
            case 1:
            case 2:
            case 3:
                System.out.println("Jest to I kwartal");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Jest to II kwartal");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Jest to III kwartal");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Jest to IV kwartal");
                break;

            default:System.out.println("Zle dane wyejsciowe");
            }
    }
}