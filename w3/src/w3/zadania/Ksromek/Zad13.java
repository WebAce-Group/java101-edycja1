package w3.zadania.Ksromek;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zad13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> Map = new HashMap<String, Integer>();
        Map.put("How much is 2 + 2?", 4);
        Map.put("How much is 54 * 4?", 216);
        Map.put("How much is 3 - 5?", -2);
        Map.put("What is the suffix of our course name? (Java...)", 101);
        Map.put("What is the current year?", 2023);
        Map.put("How old is the lecturer?", 21);
        int yes_no=0;
        int counter = 0;
        int answear;
        do
        {
            for (Map.Entry<String, Integer> i : Map.entrySet()) {
                System.out.println(i.getKey());
                answear = scan.nextInt();
                if (answear == i.getValue())
                    counter++;
            }

            if ((counter*100/Map.size())>95)
                System.out.println("Uzyskales ocene 6. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((counter*100/Map.size())>85)
                System.out.println("Uzyskales ocene 5. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((counter*100/Map.size())>75)
                System.out.println("Uzyskales ocene 4. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((counter*100/Map.size())>65)
                System.out.println("Uzyskales ocene 3. Czy chcesz zagrac ponownie? (0/1) ");
            else if ((counter*100/Map.size())>55)
                System.out.println("Uzyskales ocene 2. Czy chcesz zagrac ponownie? (0/1) ");
            else System.out.println("Uzyskales ocene 1. Czy chcesz zagrac ponownie? (0/1) ");

            yes_no=scan.nextInt();
        }while(yes_no==1);

    }
}
