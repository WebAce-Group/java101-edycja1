package w3.zadania.hjxxzk1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args)  {

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

       String a = "yes";

        while(a.equalsIgnoreCase("yes"))   {
            System.out.println("Would you like to play a game? (You can answer 'yes' if yes and 'no' if no) : ");
            a = scanner.nextLine();

            if(a.equalsIgnoreCase("yes")) {
                int answer;
                int score = 0;

                for (String e : map.keySet()) {

                    System.out.println(e);
                    answer = scanner.nextInt();
                    scanner.nextLine();

                    if (map.get(e) == answer) {
                        score++;
                    }
                }
                System.out.println(score);

                switch (score) {

                    case 7:
                        System.out.println("Well done!~ You got 6 (>95% right answers)");
                        break;
                    case 6:
                        System.out.println("Great work!~ You got 5 (>85% right answers)");
                        break;
                    case 5:
                        System.out.println("Good job!~ You got 3 (>65% right answers)");
                        break;
                    case 4:
                        System.out.println("You got 2 (>55% right answers). But you can try again! N.G.U!)");
                        break;
                    case 3:
                    case 2:
                    case 1:
                    case 0:
                        System.out.println("You're kidding, right? You got 1 (<55% right answers)");
                        break;

                }
            }
        }
    }
}
