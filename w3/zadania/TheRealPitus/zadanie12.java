import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Podaj 10 imion");
        for (int i = 0;i<10;i++)
        {
            String buffer = scanner.next();
            list.add(buffer);
        }
        Collections.sort(list);
        list.remove(0);
        for (String wynik: list)
        {
            System.out.println(wynik);
        }
    }
}
