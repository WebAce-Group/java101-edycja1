import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> trivia = new HashMap<String, Integer>();
        trivia.put("How much is the cost of the course?", 0);
        trivia.put("How much is 2 + 2?", 4);
        trivia.put("How much is 54 * 4?", 216);
        trivia.put("How much is 3 - 5?", -2);
        trivia.put("What is the suffix of our course name? (Java...)", 101);
        trivia.put("What is the current year?", 2023);
        trivia.put("How old is the lecturer?", 21);

        int answer;
        int score;
        int maxScore = trivia.size();
        int newGame = 1;
        while (newGame == 1) {
            score = 0;
            for (String x : trivia.keySet()) {
                System.out.println(x);
                answer = scanner.nextInt();
                if (answer == trivia.get(x)) {
                    score++;
                }
                else {
                    continue;
                }
            }
            if (score > maxScore * 0.95) {
                System.out.println("Your final grade is 6");
            } else if (score > maxScore * 0.85) {
                System.out.println("Your final grade is 5");
            } else if (score > maxScore * 0.75) {
                System.out.println("Your final grade is 4");
            } else if (score > maxScore * 0.65) {
                System.out.println("Your final grade is 3");
            } else if (score > maxScore * 0.55) {
                System.out.println("Your final grade is 2");
            } else {
                System.out.println("Your final grade is 1");
            }
            System.out.println(maxScore);
            System.out.println(score);
            System.out.println("Wanna try again? (1- yes, 0 - no)");
            newGame = scanner.nextInt();
        }
    }
}
