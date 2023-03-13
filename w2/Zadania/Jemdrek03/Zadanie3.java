import java.util.Scanner;
public class Zadanie3 {

    public static void jaki( int a, int b, int c)
    {
        int max = 0, min = 0, sr = 0, k = 1;
        if( a == b && a == c && b == c)
        {
            System.out.println("Trojkat jest rownoboczny");
            k = 0;
        }
        else if( a == b || a == c || b == c)
        {
            System.out.println("Trojkat jest rownoramienny");
            k = 0;
        }
        else
        {
            min = a;
            if( min > b)
            {
                min = b;
                if( min > c)
                {
                    min = c;
                    sr = b;
                    max = a;
                }
                else if( c > a)
                {
                    max = c;
                    sr = a;
                }
                else
                {
                    max = a;
                    sr = c;
                }
            }
            else if( min > c)
            {
                min = c;
                sr = a;
                max = b;
            }
            else
            {
                if( b > c)
                {
                    max = b;
                    sr = c;
                }
                else
                {
                    max = c;
                    sr = b;
                }
            }

        }

        if( min + sr > max && k == 1)
        {
            System.out.println("Trojkat jest roznoboczny");
        }
        else if( k == 1)
        {
            System.out.println("Trojkata sie nie da zbudowac");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("podaj 3 boki trojkata");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        jaki(a,b,c);
    }
}