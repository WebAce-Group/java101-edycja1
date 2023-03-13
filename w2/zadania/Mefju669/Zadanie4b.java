import java.util.Scanner;

public class Zadanie4b
{
    public static void main(String[] args)
    {
        System.out.println("Podaj numer 1-7:");
        Scanner scanner = new Scanner(System.in);
        int numer=scanner.nextInt();

        switch (numer){
            case 1-> System.out.println("poniedzialek");
            case 2-> System.out.println("wtorek");
            case 3-> System.out.println("sroda");
            case 4-> System.out.println("czwartek");
            case 5-> System.out.println("piatek");
            case 6-> System.out.println("sobota");
            case 7-> System.out.println("niedziela");
            default -> System.out.println("cos podales nie tak");
        }
    }
}
