package w2.zadania.hjxxzk;
import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args)	{

        Scanner scanner = new Scanner(System.in);

        int num = 0, sum = 0, i = -1;	//zakładam, że liczba poniżej 100 nie jest wliczana do średniej

        do {

            sum += num;
            ++i;

            System.out.println("Podaj liczbę: ");
            num = scanner.nextInt();

        } while(num > 100);

        if(i == 0)
            System.out.println("Nie podano liczby spełniającej wymagania");
        else
            System.out.println("Średnia z podanych liczb wynosi: " + ((double)sum/i));

    }
}
