import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);
        //System.out.println(map.size());
        boolean war = true;
        do{
            int countPoints = 0;
            for (Map.Entry<String,Integer> element : map.entrySet()) {
                System.out.print(element.getKey() + " ");
                int answer = scanner.nextInt();
                if (answer == element.getValue())
                    countPoints++;
            }
            int percentage = (int)((double) countPoints / map.size() * 100);
            int grade = switch (percentage) {
                case 100 -> 6;
                case 85 -> 5;
                case 71 -> 3;
                case 57 -> 2;
                default -> 1;
            };
            System.out.println("Your grade is: " + grade);
            System.out.println("Do you want to play again? Press 1 and click enter. Press 0 to stop the game.");
            int choice = scanner.nextInt();
            if(choice == 0)
                war = false;
        }while(war);
    }
}

