import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args)
    {
        Scanner liczba = new Scanner(System.in);
        int suma=0;
        int ilosc=0;
        System.out.println("Petla dziala do podania liczby wiekszej od 100");
        do
        {
            int x = liczba.nextInt();
            if (x>100) break;
            suma+=x;
            ilosc++;
        }while(true);
       System.out.println((float)suma/(float)ilosc);
    }
}
