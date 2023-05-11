import java.util.HashMap;
import java.util.Scanner;

public class Zadanie13
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

        boolean choice;
        int result;
        int answer;

        do
        {
            result = 0;

            for (String question : map.keySet()) 
            {
                System.out.println(question);
                answer = scanner.nextInt();

                if (answer == map.get(question))
                {
                    result++;
                }
            }

            System.out.println("Your result: " + Integer.toString(result));
            double grade = Math.round(((double)result / 7.0) * 100.0);
            if (grade >= 95)
            {
                System.out.println("Your grade is 6");
            }
            else if (grade >= 85)
            {
                System.out.println("Your grade is 5");
            }
            else if (grade >= 75)
            {
                System.out.println("Your grade is 4");
            }
            else if (grade >= 65)
            {
                System.out.println("Your grade is 3");
            }
            else if (grade >= 55)
            {
                System.out.println("Your grade is 2");
            }
            else
            {
                System.out.println("Your grade is 1 :("); 
            }

            System.out.println("Play again? (Press 'e' to exit, press any other key to continue)");
            scanner.nextLine();

            if (scanner.nextLine().equals("e"))
            {
                choice = false;
            }
            else
            {
                choice = true;
            }

        } while (choice);

        scanner.close();
    }
}