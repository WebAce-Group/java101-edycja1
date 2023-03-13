import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b=0;
        System.out.println("podaj liczbe");
        a=scanner.nextInt();
        while(a!=0) {
           b+=a;
            System.out.println(b);
           System.out.println("podaj liczbe");
           a=scanner.nextInt();

        }
    }
}