import java.util.Scanner;

public class Zadanie7
{
    public static void main(String[] args)
    {
        boolean decision=true;
        int licznik=0;
        int suma=0;
        Scanner scanner=new Scanner(System.in);
        do
        {
            System.out.println("Podaj liczbe: ");
            int podanaLiczba=scanner.nextInt();
            suma=suma+podanaLiczba;
            licznik++;

        }
        while (suma<=100);

        System.out.println("Srednia: "+ (double) suma/licznik);
    }
}
