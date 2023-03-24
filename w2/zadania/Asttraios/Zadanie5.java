import java.util.Scanner;

public class Zadanie5 {
    public static void main(String [] args) {

        System.out.println("Podaj dodatnia liczbe calkowita: ");
        Scanner input3 = new Scanner(System.in);
        int n=input3.nextInt();

        while(n<=0)
        {
            System.out.println("Podaj liczbe dodatnia!:  ");
            n=input3.nextInt();
        }

        input3.close();
        System.out.println("Wynik: ");

        for(int i=0; i<n; i++)
        System.out.println(1+i);

        System.out.println("-----------");

        for(int j=0; j<n; j++ )
        System.out.println(n-j);

        System.out.println("--------------");

        for(int k=1; k<=n; k++)
        {
            if(k%3==0||k%5==0)  System.out.println(k);
        }
        
        System.out.println("---------");
        
        for(int k=1; k<=n; k++)
        {
            if(k%3==0&&k%5==0)  continue;
            else if(k%3==0||k%5==0) System.out.println(k);
        }
        
    }
}
