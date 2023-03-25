package w2.Zadania.MiloszWS;
import java.util.Scanner;


public class Zadanie6 {
    public static void main(String[] args)
    {
        Scanner Liczba = new Scanner(System.in);
        boolean sprawdzenie=true;
        int suma=0;

        System.out.println("Prosze wpisywac liczby: ");
        while(sprawdzenie)
        {
            int n = Liczba.nextInt();
            if (n==0)
            {
                sprawdzenie=false;
            }
            else {
                suma+=n;
            }
        }
        System.out.println("Suma podanych liczb wynosi: " + suma);

    }

}
