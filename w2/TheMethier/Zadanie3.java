import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3
{
    public static void main(String arg[])
    {
        System.out.println("Ten program sprawdza, czy z podanych przez użytkownika boków można zbudować trójkąt. Jeżeli można to zrobić to podaje jego rodzaj.");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj a:");
        int a= scanner.nextInt();
        System.out.println("Podaj b:");
        int b= scanner.nextInt();
        System.out.println("Podaj c:");
        int c= scanner.nextInt();
        if(((a>=b)&&(a>=c)&(a<b+c))||((b>=c)&&(b>=a)&&(b<a+c))||((c>=a)&&(c>=b)&&(c<a+b)))
        {
            if ((a == b) && (b == c))
            {
                System.out.println("Jest to trójkąt równoboczny");
            }
            else if (((a == b) && (a != c))||((b == c) && (a != b))||((a==c)&&(a!=b)))
            {
                System.out.println("Jest to trójkąt równoramienny");
            }
            else
            {
                System.out.println("Jest to trójkąt różnoboczny");
            }
        }
        else
        {
            System.out.println("Nie da się zbudować trójkąta.");
        }


    }
}
