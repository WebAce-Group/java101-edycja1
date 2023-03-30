import java.util.*;

public class zadanie13
{
    public static void main(String[] args)
    {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);

        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

        int n = 0;
        do
        {
            n = 0;
            for (Map.Entry<String, Integer> entry : mapa.entrySet())
            {
                System.out.print(entry.getKey()+" ");

                int m = scan.nextInt();

                if(m == entry.getValue()) n++;
            }
            
            // > 95% - ocena 6, 85% - ocena 5, 75% - ocena 4, 65% - ocena 3, 55% - ocena 2, < 55% - ocena 1

            if (n == 7) System.out.println("otrzymałeś ocenę 6!");
            else 
            {
                if ( n == 6) System.out.println("otrzymałeś ocenę 5!");
                else
                {
                    if(n == 5) System.out.println("otrzymałeś ocenę 3!");
                    else
                    {
                        if(n == 4) System.out.println("otrzymałeś ocenę 2!");
                        else System.out.println("otrzymałeś ocenę 1!");
                    }
                }
            }

            System.out.println("jeśli chcesz zagrać ponownie naciśnij 8");
            n = scan.nextInt();

        }while(n == 8);       
    }
}