import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok");
        int b1 = scanner.nextInt();
        System.out.println("Podaj drugi bok");
        int b2 = scanner.nextInt();
        System.out.println("Podaj trzeci bok");
        int b3 = scanner.nextInt();
        if(b1+b2 > b3 && b1+b3 > b2 && b2+b3 > b1)
        {
            if(b1 == b2 && b1 == b3)
                System.out.println("Trojkąt jest równoboczny");
            else if (b1 == b2 || b1 == b3 || b2 == b3)
                System.out.println("Trojkat jest rownoramienny");
            else
                System.out.println("Trojkat jest roznoboczny");
        }
        else
            System.out.println("Trojkata nie mozna zbudowac");
    }
}
