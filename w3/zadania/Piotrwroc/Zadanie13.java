import java.util.*;
public class Zadanie13 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> quiz = new HashMap<>();
        quiz.put("How much is the cost of the course?", 0);
        quiz.put("How much is 2 + 2?", 4);
        quiz.put("How much is 54 * 4?", 216);
        quiz.put("How much is 3 - 5?", -2);
        quiz.put("What is the suffix of our course name? (Java...)", 101);
        quiz.put("What is the current year?", 2023);
        quiz.put("How old is the lecturer?", 21);
        System.out.println();
        int x=1;
        while(x!=0)
        {
            float score=0;
            for (String pytanko: quiz.keySet())
            {
                System.out.println(pytanko);
                int odp=scanner.nextInt();
                if (quiz.get(pytanko)==odp)
                {
                    score++;
                }
            }
            if((score/7)>0.95)
            {
                System.out.println("ocena 6");
            }
            else if((score/7)>0.85)
            {
                System.out.println("ocena 5");
            }
            else if((score/7)>0.75)
            {
                System.out.println("ocena 4");
            }
            else if((score/7)>0.65)
            {
                System.out.println("ocena 3");
            }
            else if((score/7)>0.55)
            {
                System.out.println("ocena 2");
            }
            else
            {
                System.out.println("ocena 1");
            }
            System.out.println("Jezeli chcesz wyjsc z quizu wpisz 0");
            x=scanner.nextInt();
        }
        System.out.println();
    }
}