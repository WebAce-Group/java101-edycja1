import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugi bok:");
        int b = scanner.nextInt();
        System.out.println("Podaj trzeci bok:");
        int c = scanner.nextInt();

        if (a<=0 || b<=0 || c<=0)
        {
            System.out.println("Bok nie moze byc ujemny badz rowny zero");
        }
        else if (a+b>c && a+c>b && b+c>a)
        {
            if (a==b && b==c)
            {
                System.out.println("Trojkat mozna zbudowac i jest rownoboczny");
            }
            else if (a==b || a==c)
            {
                System.out.println("Trojkat mozna zbudowac i jest rownoramienny");
            }
            else
            {
                System.out.println("Trojkat mozna zbudowac i jest roznoboczny");
            }
        }
        else
        {
            System.out.println("Trojkat nie mozna zbudowac");
        }
    }
}