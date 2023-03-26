import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> Tab = new HashMap<>();
        Tab.put("How much is the cost of the course?",0);
        Tab.put("How much is 2 + 2?",4);
        Tab.put("How much is 54 * 4?",216);
        Tab.put("How much is 3 - 5?",-2);
        Tab.put("What is the suffix of our course name? (Java...)",101);
        Tab.put("What is the current year?",2023);
        Tab.put("How old is the lecturer?",21);
        int k = 1;
        float wynik = 0;
        float ilosc = Tab.size();
        int odp = 0;
        System.out.println("Po kazdym pytaniu podaj sowja odpowiedz");
        while( k == 1)
        {
            wynik = 0;
            for( String e : Tab.keySet())
            {
                System.out.println(e);
                odp = scanner.nextInt();
                if( odp == Tab.get(e))
                {
                    wynik++;
                }
            }
            if( wynik*100/ilosc > 95)
            {
                System.out.println("Twoja ocena to 6");
            }
            else if( wynik*100/ilosc > 85)
            {
                System.out.println("Twoja ocena to 5");
            }
            else if( wynik*100/ilosc > 75)
            {
                System.out.println("Twoja ocena to 4");
            }
            else if( wynik*100/ilosc > 65)
            {
                System.out.println("Twoja ocena to 3");
            }
            else if( wynik*100/ilosc > 55)
            {
                System.out.println("Twoja ocena to 2");
            }
            else
            {
                System.out.println("Twoja ocena to 1");
            }
            System.out.println();
            System.out.println("Czy chcesz dalej grac?");
            System.out.println("Jezeli tak wpisz 1, jezeli nie wpisz 0");
            k = scanner.nextInt();
        }


    }
}