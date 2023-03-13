import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b=0;
        int c=0;
        int d=0;
        System.out.println("podaj liczbe");
        a=scanner.nextInt();
        do
        {
          d++;
          b += a;
          c= b/d;
          System.out.println(c);
          System.out.println("podaj liczbe");
          a=scanner.nextInt();
        }while(a<100);
    }
}