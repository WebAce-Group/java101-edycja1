import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);
        Boolean restart = true;
        while (restart)
        {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        //int ans = scan.nextInt();
            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                System.out.println(entry.getKey());
                if (scan.nextInt() == entry.getValue())
                    score++;

            }


            switch (score)
            {
                case 7:
                    System.out.println("Ocena 6");
                    break;
                case 6:
                    System.out.println("Ocena 5");
                    break;
                case 5:
                    System.out.println("Ocena 3");
                    break;
                case 4:
                    System.out.println("Ocena 2");
                    break;
                default:
                    System.out.println("Ocena 1");


            }
            score = 0;
            String play_again ="";
            scan.nextLine();

            while(!play_again.equals("T") && !play_again.equals("N"))
            {

                System.out.println("Czy chcesz zagrac jeszcze raz ? [T/N]");
                play_again = scan.nextLine();

                if(play_again.equals("T"))
                    ;
                if(play_again.equals("N"))
                {
                    restart = false;

                }
            }





        }
    }

}
