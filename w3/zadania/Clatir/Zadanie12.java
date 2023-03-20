import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Zadanie12 {
    public static void main (String args[])

    {
        ArrayList<String> tabL = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i =0; i<10;i++)
            tabL.add(scan.nextLine());
        tabL.sort(Comparator.naturalOrder());
        tabL.remove(0);
        for(String imie: tabL)
            System.out.println(imie);






    }
}
