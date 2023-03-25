import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> questions = new HashMap<String, Integer>();
        boolean wantToPlay = true;
        int points = 0, userAnswer, foo;

        questions.put("How much is the cost of the course?", 0);
        questions.put("How much is 2 + 2?", 4);
        questions.put("How much is 54 * 4?", 216);
        questions.put("How much is 3 - 5?", -2);
        questions.put("What is the suffix of our course name? (Java...)", 101);
        questions.put("What is the current year?", 2023);
        questions.put("How old is the lecturer?", 21);

        while (wantToPlay) {
            for (Map.Entry<String, Integer> entry : questions.entrySet()) {
                System.out.println(entry.getKey());
                userAnswer = scanner.nextInt();
                if (userAnswer == entry.getValue())
                    points++;
            }
//                results
            double result = (double) points / 7;
            System.out.println("Points: " + points  + "/7");
            System.out.print("Ocena ");
            if (result > 0.95)
                System.out.print("6");
            else if (result > 0.85)
                System.out.print("5");
            else if (result > 0.75)
                System.out.print("4");
            else if (result > 0.65)
                System.out.print("3");
            else if (result > 0.55)
                System.out.print("2");
            else
                System.out.print("1");
            System.out.print("\n");

            System.out.println("Want to play again? press 1");
            foo = scanner.nextInt();
            points = 0;
            if (foo != 1)
                wantToPlay = false;
        }
    }
}
