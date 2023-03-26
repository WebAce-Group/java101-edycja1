package zadania.Kasper123213;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        Map<String, Integer> questions = new HashMap<>();
        try {
            File file = new File("trivia.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String question = scanner.nextLine();
                if(question=="")continue;
                int answer = Integer.parseInt(scanner.nextLine());
                questions.put(question, answer);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się odczytać pliku z pytaniami.");
            return;
        }



        Scanner input = new Scanner(System.in);
        int score = 0;
        int totalQuestions = questions.size();
        for(String question :questions.keySet()){
            System.out.println(question);
            int userAnswer = input.nextInt();
            if (userAnswer == questions.get(question)) {
                score++;
            }

        }



        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Twój wynik to: " + score + " / " + totalQuestions);
        System.out.print("Ocena: ");
        if (percentage > 95) {
            System.out.println("6");
        } else if (percentage > 85) {
            System.out.println("5");
        } else if (percentage > 75) {
            System.out.println("4");
        } else if (percentage > 65) {
            System.out.println("3");
        } else if (percentage > 55) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }

        System.out.println("Chcesz zagrać ponownie? (tak / nie)");
        String playAgain = input.next();
        if (playAgain.equalsIgnoreCase("tak")) {
            main(args);
        }
        input.close();
    }

}
