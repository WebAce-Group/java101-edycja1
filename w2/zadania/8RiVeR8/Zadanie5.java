import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] arg){
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n=liczba.nextInt();

        for (int i=0; i<n; i++)
            System.out.println(i+1);
        System.out.println("-------------------");
        for (int i=n; i>=1; i--)
            System.out.println(i);
        System.out.println("-------------------");
        for (int i=1; i<=n; i++){
            if (i%3==0 | i%5==0)
                System.out.println(i);
        }
        System.out.println("-------------------");
        for(int i=1; i<=n; i++){
            if(i%3==0 & i%5!=0)
                System.out.println(i);
            if (i%5==0 & i%3!=0)
                System.out.println(i);
        }
    }
}
