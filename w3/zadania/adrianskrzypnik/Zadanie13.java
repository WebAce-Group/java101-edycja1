import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> questions = new HashMap<>();

        questions.put("How much is the cost of the course?", 0);
        questions.put("How much is 2 + 2?", 4);
        questions.put("How much is 54 * 4?", 216);
        questions.put("How much is 3 - 5?", -2);
        questions.put("What is the suffix of our course name? (Java...)", 101);
        questions.put("What is the current year?", 2023);
        questions.put("How old is the lecturer?", 21);

        Scanner scanner = new Scanner(System.in);

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            for (Map.Entry<String, Integer> entry : questions.entrySet()) {
                System.out.println(entry.getKey());
                int answer = scanner.nextInt();
                if (answer == entry.getValue()) {
                    score++;
                }
            }

            double percentage = (double) score / questions.size() * 100;
            System.out.println("Twój wynik to: " + score + "/" + questions.size() + " (" + percentage + "%)");

            if (percentage > 95) {
                System.out.println("Twoja ocena to 6");
            } else if (percentage > 85) {
                System.out.println("Twoja ocena to 5");
            } else if (percentage > 75) {
                System.out.println("Twoja ocena to 4");
            } else if (percentage > 65) {
                System.out.println("Twoja ocena to 3");
            } else if (percentage> 55) {
                System.out.println("Twoja ocena to 2");
            } else {
                System.out.println("Twoja ocena to 1");
            }

            System.out.println("Czy chcesz zagrać ponownie? (tak/nie)");
            String playAgainInput = scanner.next();
            if (playAgainInput.equalsIgnoreCase("nie")) {
                playAgain = false;
            } else if (playAgainInput.equalsIgnoreCase("tak")) {
                score = 0;
            } else {
                System.out.println("zła odpowiedź, koniec gry");
                playAgain = false;
            }
        }

        scanner.close();
    }

}
