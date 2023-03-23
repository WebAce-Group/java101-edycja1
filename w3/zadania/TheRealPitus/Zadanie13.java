import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        String buffer = "t";
        float score=0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("How much is the cost of the course?",0);
        map.put("How much is 2 + 2?",4);
        map.put("How much is 54 * 4?",216);
        map.put("How much is 3 - 5?",-2);
        map.put("What is the suffix of our course name? (Java...)",101);
        map.put("What is the current year?",2023);
        map.put("How old is the lecturer?",21);
        do
        {
            for (Map.Entry<String, Integer> entry:map.entrySet())
            {
                String question = entry.getKey();
                int goodAnswer = entry.getValue();

                System.out.println(question);
                int answer = scanner.nextInt();
                if (answer == goodAnswer)
                {
                   score++;
                }
            }
            int percent = (int) ((score/7)*100);

            String grade = switch (percent)
                    {
                        case 100,99,98,97,96,95 -> "Twoja ocena to 6";
                        case 94,93,92,91,90,89,88,87,86,85 -> "Twoja ocena to 5";
                        case 84,83,82,81,80,79,78,77,76,75 -> "Twoja ocena to 4";
                        case 74,73,72,71,70,69,68,67,66,65 -> "Twoja ocena to 3";
                        case 64,63,62,61,60,59,58,57,56,55 -> "Twoja ocena to 2";
                        default -> "Twoja ocena to 1";
                    };
            System.out.println(grade);
            System.out.println("Koontynuwać? (t/n)");
            buffer = scanner.next();
        }while (buffer.equals("t"));
    }
}
