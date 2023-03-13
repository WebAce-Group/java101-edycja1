import java.util.Scanner;

public class Zadanie5
{
    public static void main(String arg[]) {

        System.out.println("Zadanie 5.1:");
        System.out.println("Podaj n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n+1; i++)
        {
            System.out.println(i);
        }
        System.out.println("Zadanie 5.2:");
        System.out.println("Podaj n:");
        n = scanner.nextInt();
        for (int i= n; i<1;i++){
            System.out.println(i);
        }
        System.out.println("Zadanie 5.3:");
        System.out.println("Podaj n:");
        n = scanner.nextInt();
        for(int i=1;i<n+1;i++)
        {
            if ((i%3==0)||(i%5==0))System.out.println(i);
        }
        System.out.println("Zadanie 5.4:");
        System.out.println("Podaj n:");
        n = scanner.nextInt();
        for(int i=1;i<n+1;i++)
        {
            if (((i%3==0)||(i%5==0))&!((i%3==0)&&(i%5==0)))System.out.println(i);
        }
    }
}
