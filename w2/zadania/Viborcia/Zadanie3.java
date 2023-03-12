package w2.zadania.Viborcia;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trojkata a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugi bok trojkata b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzeci bok trojkata c: ");
        int c = scanner.nextInt();
        System.out.println("Twoj trojkat sklada sie z bokow: " + a +" , " + b +" , " + c);

        if(a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Z podanych bokow da sie zbudowac trojkat. ");
            if(a==b && b==c && a==c)
            {
                System.out.println("Twoj trojkat jest rownoboczny.");
            }
            else if(a==b || b==c || a==c)
            {
                System.out.println("Twoj trojkat jest rownoramienny.");
            }
            else
            {
                if(a!=b && b!=c && a!=c)
                {
                    System.out.println("Twoj trojkat jest roznoboczny.");
                }
            }
        }
        else
        {
            System.out.println("Z podanych bokow nie da sie zbudowac trojkata. ");
        }


    }
}
