import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args)
    {
        int sumaCyfr=0,licznik=0,liczba=0;
        double srednia=0.0d;



        do
        {
            liczba = new Scanner(System.in).nextInt();
            if (liczba <=100)
            {
                sumaCyfr += liczba;
                licznik++;
            }

            else
            {
                 srednia = (double) sumaCyfr/licznik;


            }

        }
        while (liczba<=100);

        System.out.println(srednia);
    }
}
