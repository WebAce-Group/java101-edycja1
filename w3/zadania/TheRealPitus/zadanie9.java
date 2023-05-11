import java.util.Scanner;
import static java.lang.Math.*;
public class zadanie9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        for (int i = 0; i<10;i++)
        {
            System.out.println("Podaj "+(i+1)+" liczbę: ");
            tablica[i] = scanner.nextInt();
            tablica[i] = (int) pow(tablica[i], i);
        }
        for (int debug: tablica)
        {
            System.out.println(debug);
        }
        
    }
}