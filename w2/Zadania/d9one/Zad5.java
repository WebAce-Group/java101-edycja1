package w2.Zadania.d9one;
import java.util.Scanner;
import static java.lang.Math.*;
public class Zad5 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        n = scanner.nextInt();
        n = abs(n);
        for(int i=1; i<n+1; i++)
            System.out.println(i);
        for(int i=n; i>0; i--)
            System.out.println(i);
        for(int i=1; i<n+1; i++){
            if(i%3==0 || i%5==0)
                System.out.println(i);
        }
        for(int i=1; i<n+1; i++){
            if((i%3==0 || i%5==0) && i%15!=0)
                System.out.println(i);
        }

    }
}
