import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Zadanie13 {
    
    public static void main(String [] args) {
        
        String decyzja;
        do
        {
            
            int wynik=0;

        Map<String, Integer> quiz = new HashMap<String, Integer>();
        quiz.put("How much is the cost of the course?", 0);
        quiz.put("How much is 2 + 2?", 4);
        quiz.put("How much is 54 * 4?", 216);
        quiz.put("How much is 3 - 5?", -2);
        quiz.put("What is the suffix of our course name? (Java...)", 101);
        quiz.put("What is the current year?", 2023);
        quiz.put("How old is the lecturer?", 21);

        Scanner input= new Scanner(System.in);
        
        for( Map.Entry<String, Integer> answer: quiz.entrySet())
        {
            System.out.println(answer.getKey());
            System.out.println("Odpowiedź: ");
            int odp=input.nextInt();

            if(odp==answer.getValue())
            {
                wynik++;
            }

        }
        System.out.println("Twój wynik: "+wynik+"/7");

        double srednia;

        srednia=(double)wynik/7;

        if(srednia>=0.95)
        System.out.println("Ocena: 6");
        else if(srednia>=0.85)
        System.out.println("Ocena: 5");
        else if(srednia>=0.75)
        System.out.println("Ocena: 4");
        else if(srednia>=0.65)
        System.out.println("Ocena: 3");
        else if(srednia>=0.55)
        System.out.println("Ocena: 2");
        else 
        System.out.println("Ocena: 1");

        System.out.println("Chcesz zagrac ponownie? [Y/N]");
        
        input.nextLine();

        decyzja=input.nextLine();
        


        }while(decyzja.equalsIgnoreCase("Y"));
      
    }

}
