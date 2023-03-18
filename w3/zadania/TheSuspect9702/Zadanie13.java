package w3.zadania.TheSuspect9702;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        HashMap<String, Integer> trivia = new HashMap<>();
        int score;
        Scanner scan = new Scanner(System.in);
        trivia.put("How much is the cost of the course", 0);
        trivia.put("How much is 2 + 2", 4);
        trivia.put("How much is 54*4", 216);
        trivia.put("How much is 3 - 5", -2);
        trivia.put("What is the suffix of out course name? (Java...)", 101);
        trivia.put("How much is the current year?", 2023);
        trivia.put("How old is the lecturer", 21);
        do{
            score = 0;
            for(String a : trivia.keySet()){
                System.out.print(a + ": ");
                if(trivia.get(a) == scan.nextInt())
                    score++;
            }
            switch (score){
                case 0,1,2,3->
                    System.out.println("Ocena 1, weź się lepiej do roboty");
                case 4 -> System.out.println("Ocena 2, na studiach byś uwalił");
                case 5 -> System.out.println("Ocena no tak 3+, nie jest źle mogło być lepiej");
                case 6 -> System.out.println("Stabilne 5, dobra robota");
                case 7 -> System.out.println("6, idź lepiej w milionerów zagraj bo tu to się marnujesz");
            }
            System.out.println("Jesli chcesz zagrac ponownie wpisz 0");
        }while (scan.nextInt() == 0);
    }
}
