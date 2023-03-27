import java.util.*;

public class zadanie12
{
    public static void main(String[] args)
    {
        ArrayList<String> tablica = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("podaj imię: ");
            String m = scan.nextLine();
            tablica.add(m);
        }

        Collections.sort(tablica);

        tablica.remove(0);


        System.out.print("imiona w kolejności alfabetycznej to: ");
        int n = 0;
        for (String i : tablica)
        {
            System.out.print(tablica.get(n)+" ");
            n++;
        }
        System.out.println();
    }    
}