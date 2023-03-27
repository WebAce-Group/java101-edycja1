import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

        int czy=0;
        int odpowiedz;

        do
        {
            int wynik=0;
            for(Map.Entry<String,Integer> e : mapa.entrySet())
            {
                System.out.println(e.getKey());
                odpowiedz=scanner.nextInt();
                if (odpowiedz==e.getValue())
                    wynik++;
            }
            if ((wynik*100/mapa.size())>95)
                System.out.println("Uzyskales ocene 6. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((wynik*100/mapa.size())>85)
                System.out.println("Uzyskales ocene 5. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((wynik*100/mapa.size())>75)
                System.out.println("Uzyskales ocene 4. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((wynik*100/mapa.size())>65)
                System.out.println("Uzyskales ocene 3. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((wynik*100/mapa.size())>55)
                System.out.println("Uzyskales ocene 2. Czy chcesz zagrac ponownie? (0/1) ");
            else System.out.println("Uzyskales ocene 1. Czy chcesz zagrac ponownie? (0/1) ");
            czy=scanner.nextInt();
        } while (czy==1);


    }
}
