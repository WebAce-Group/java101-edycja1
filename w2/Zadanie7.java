import java.util.Scanner;

public class Zadanie7 {
    public static void main(String arg[])
    {

        int p=0;
        int sum=0;
        int n=0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            p= scanner.nextInt();
            sum+=p;
            n++;
        }
        while(p<100);
        float mean=(float)(sum)/(float)(n);
        System.out.println(mean);
    }
}