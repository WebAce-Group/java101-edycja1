import java.util.Scanner;
public class Zadanie5 {
    public static void petla(int n)
    {
        int i = 0;
        System.out.println("Petla od 1 do n");
        for( i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Petla od n do 1");
        for( i = n; i >= 1 ; i--)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Petla od 1 do n dla % 5 == 0 lub % 3 == 0");

        for( i = 1; i <=n; i++)
        {
            if( i % 3 == 0 || i % 5 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Petla od 1 do n dla % 5 == 0 lub % 3 == 0 ale nie lacznie");
        for( i = 1; i <= n; i++)
        {
            if( (i % 3 == 0 && i % 5 != 0) || (i % 3 != 0 && i % 5 == 0))
            {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        petla(n);


    }
}