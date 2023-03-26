package w3.zadania.MatiBukowski;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            game();
            System.out.print("\nDo you want to play next round? (1 - YES/ 0 - NO): ");
            value = scanner.nextInt();
        }
        while(value == 1);

    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

        int a = 1;
        int b;
        double points = 0;
        int score;

        for(String x: map.keySet()) {
            System.out.println("Question " + a + ": " + x);
            a++;

            System.out.print("Answer: ");
            b = scanner.nextInt();
            if(b == map.get(x))
                points++;
        }
        points=(points/7)*100;

        if(points>95)
            score = 6;
        else if (points<=95 && points>=85)
            score = 5;
        else if(points<85 && points>=75)
            score = 4;
        else if(points<75 && points>=65)
            score = 3;
        else if(points<65 && points>=55)
            score = 2;
        else score = 1;

        System.out.print("\nScore: " + score);
    }
}
