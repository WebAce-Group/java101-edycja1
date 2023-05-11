package w3.zadania.JBar02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odp, pkt = 0, n = 0;
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

       do {

           System.out.println("\nwcisnij 1 i  zagraj w gre");
           System.out.println("wcisnij 2 i zakoncz");
           n = scanner.nextInt();
            if(n==2) break;


            for (Map.Entry<String, Integer> item : mapa.entrySet()) {
                System.out.println(item.getKey());
                //do{
                System.out.println("podaj odpowiedz :");
                odp = scanner.nextInt();
                if (odp == item.getValue()) pkt++;
                //}while (odp!=item.getValue());//dopoki wpisana liczba jest inna od wartosci w mapie to moge podawac
            }
           System.out.println(mapa.size());
            System.out.print("Gratulacje zebrales: " + pkt + " punktow jest to ocena: ");
            float wynik=pkt / (float)mapa.size();
            if (wynik >= 0.95) System.out.print("6");
            else if (wynik >= 0.85) System.out.print("5");
            else if (wynik >= 0.75) System.out.print("4");
            else if (wynik >= 0.65) System.out.print("3");
            else if (wynik >= 0.55) System.out.print("2");
             if (wynik <= 0.54) System.out.print("1\n");
           pkt =0;
        }while (n!=2);
    }
}