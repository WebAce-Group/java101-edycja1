import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class zadanie13 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 4);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);
        boolean playAgain = true;
        int correct;
        Scanner scanner = new Scanner(System.in);
        while(playAgain==true){
            correct = 0;
            for(String question : map.keySet()){
                System.out.println(question);
                int answer = scanner.nextInt();
                if(answer==map.get(question)){
                    correct++;
                }
            }
            int wynik = switch (correct){
                case 7 -> 6;
                case 6 -> 5;
                case 5 -> 4;
                case 4 -> 3;
                case 3 -> 2;
                case 2, 1 -> 1;
                default -> 0;
            };
            System.out.println("Twój wynik to: ");
            System.out.println(wynik);
            System.out.println("Press 1 to play again");
            int acceptToPlayAgain = scanner.nextInt();
            playAgain = (acceptToPlayAgain==1) ? true : false;


        }

    }
}
