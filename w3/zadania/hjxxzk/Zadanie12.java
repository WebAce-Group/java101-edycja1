package w3.zadania.hjxxzk1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Zadanie12 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<>();

        int i = 1;

        while(i <= 10)   {

            System.out.print("Podaj tekst " + i + ": ");
            list.add(scanner.nextLine());
            ++i;

        }

        sort(list);

        list.remove(0);


        for(String e : list)    {
            System.out.println(e);
        }



    }
}
