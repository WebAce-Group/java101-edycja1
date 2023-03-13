import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("podaj liczbe calkowita dodatnia");
        n=scanner.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
            for(int j=i;j>=1 && (j/5 || j/3);j--)
            {
                System.out.println(j);
            }
            for(int k = i; k>=1 && (k/5 || k/3)&& !((k / 5) && !(k / 3)); k--)
            {
                System.out.println(k);
            }
        }

    }
}