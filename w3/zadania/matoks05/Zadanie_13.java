import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie_13 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>(Map.of("How much is the cost of the course?", 0,
                "How much is 2 + 2?", 4,
                "How much is 54 * 4?", 216,
                "How much is 3 - 5?", -2,
                "What is the suffix of our course name? (Java...)", 101,
                "What is the current year?", 2023,
                "How old is the lecturer?", 21));
        Scanner scan = new Scanner(System.in);
        int answer, points_counter;
        while (true) {
            points_counter = 0;
            System.out.println("Rozpocznij od poczatku: ");
            for (String question : mapa.keySet()) {
                System.out.println(question);
                answer = scan.nextInt();
                if (answer == mapa.get(question)) {
                    points_counter++;
                }
            }
            double result = ((double) points_counter * 100.0) / ((double) mapa.size());
            System.out.println("result: " + ((double) points_counter * 100.0) / ((double) mapa.size()));
            if(result>=95){
                System.out.println("ocena 6");
            }
            else if(result>=85 && result<95){
                System.out.println("ocena 5");
            }
            else if(result>=75 && result<85){
                System.out.println("ocena 4");
            }
            else if(result>=65 && result<75){
                System.out.println("ocena 3");
            }
            else if(result>=55 && result<65){
                System.out.println("ocena 2");
            }
            else{
                System.out.println("ocena 1");
            }

            System.out.println("Please type any key to continue or type \'quit\'");
            if ("quit".equals(scan.next()))
                break;
        }
    }
}
