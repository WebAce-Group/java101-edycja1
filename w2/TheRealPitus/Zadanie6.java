import java.util.Scanner;

public class Zadanie6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean False = true;
        int b=0;
        while (False)
        {
            System.out.println("Podaj numer: ");
            int a = scanner.nextInt();
            b+=a;
            if (a==0)
            {
                False =!False;
            }
        }
        System.out.println("Suma twoich liczb wynosi: "+b);
    }
}
