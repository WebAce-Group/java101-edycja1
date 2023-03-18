import java.util.Scanner;

public class Zadanie6 {
    public static void main(String [] args)
    {

        boolean a = true;
        int sumaCyfr =0;
        Scanner scan = new Scanner(System.in);
        while(a)
        {
            int liczba = scan.nextInt();
            if(liczba == 0)
                a = false;
            else
                sumaCyfr += liczba;

        }
        System.out.println(sumaCyfr);

    }
}
