import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> p = new HashMap<>();
        p.put("How much is the cost of the course?", 0);
        p.put("How much is 2 + 2?", 4);
        p.put("How much is 54 * 4?", 216);
        p.put("How much is 3 - 5?", -2);
        p.put("What is the suffix of our course name? (Java...)", 101);
        p.put("What is the current year?", 2023);
        p.put("How old is the lecturer?", 21);
        while (true)
        {
            for (String pytania : p.keySet())
            {
                System.out.println(pytania);
                int odpowiedz = scanner.nextInt();
                if (p.get(pytania) == odpowiedz)
                {
                        System.out.println("Poprawna odpowiedz!");
                        score++;
                }
                else
                {
                        System.out.println("Bledna odpowiedz!");
                }

                }
            System.out.println("Zdobyles: " + score + " puntkow.");
            double percent=((double)(score)/7)*100;
                if(percent>95)
                {
                    System.out.println("Dostałeś ocenę 6!");
                }
                else if (percent>85)
                {
                    System.out.println("Dostałeś ocenę 5!");
                }
                else if (percent>75)
                {
                    System.out.println("Dostałeś ocenę 4!");
                }
                else if (percent>65)
                {
                    System.out.println("Dostałeś ocenę 3!");
                }
                else if (percent>55)
                {
                    System.out.println("Dostałeś 2!");
                }
                else
                {
                    System.out.println("Dostałeś 1!");
                }
            System.out.println("Czy chcesz zagrac ponownie (Jeżeli tak - wpisz 1):");
            int decyzja = scanner.nextInt();
                if (decyzja == 1)
                {
                    System.out.println("To zaczynamy od nowa!");
                }
                else
                {
                break;
                }
            }
        }
    }

