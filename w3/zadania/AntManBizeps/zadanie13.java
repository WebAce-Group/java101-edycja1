import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> trivia = new HashMap<String, Integer>();
        trivia.put("How much is the cost of the course?: ",0);
        trivia.put("How much is 2 + 2?: ", 4);
        trivia.put("How much is 54 * 4?: ", 216);
        trivia.put("How much is 3 - 5?: ", -2);
        trivia.put("What is the suffix of our course name? (Java...): ", 101);
        trivia.put("What is the year?: ", 2023);
        trivia.put("How old is the lecturer?: ", 21);

        boolean choice;
        float score = 0.0f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wanna play?[Y/N]");
        if(scanner.nextLine().equals("Y")){
            choice = true;
            System.out.println("Let's play!");
        } else {choice = false;
            System.out.println("Go away you d'bag!");
        }

        while(choice){
            for (Map.Entry<String, Integer> entry : trivia.entrySet()) {
                System.out.println(entry.getKey());
                if(entry.getValue().equals(scanner.nextInt())) score++;
                else continue;
            }
            if(score/7.0f >= 0.95){
                System.out.println("Ocena 6!");
            } else if(score/7.0f >= 0.90){
                System.out.println("Piątka!");
            } else if(score/7.0 >= 0.75){
                System.out.println("Czwóra!");
            } else if(score/7.0 >= 0.63){
                System.out.println("Trzy!");
            } else if(score/7.0 >= 0.50){
                System.out.println("Zdane, dwója!");
            } else System.out.println("Szmata, nie zdane!");

            System.out.println("Wanna play again?[Y/N]");
            scanner.nextLine();
            if(scanner.nextLine().equals("Y")){
                choice = true;
                System.out.println("Let's play!");
            } else {choice = false;
                System.out.println("Go away you d'bag!");
            }
            

       }

    }
}
