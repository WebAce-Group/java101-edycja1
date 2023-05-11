import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

        int points = 0;
        for (Map.Entry<String, Integer> queston : map.entrySet()) {
            System.out.println(queston.getKey());
            int answer = text.nextInt();
            if(answer == queston.getValue())
            {
                points++;
            }
        }

        int grade = 0;

        float resutlsProcentage = (float) points / map.size();
        if(resutlsProcentage > 0.95) grade = 6;
        else if(resutlsProcentage > 0.85) grade = 5;
        else if(resutlsProcentage > 0.75) grade = 4;
        else if(resutlsProcentage > 0.65) grade = 3;
        else if(resutlsProcentage > 0.55) grade = 2;
        else if(resutlsProcentage < 0.55) grade = 1;

        System.out.println("Twoja ocena to: " + grade);

    }
}
