package w3.zadania.Ksromek;
import java.util.*;

public class Zad12
{
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();
        List.add("Kamil");
        List.add("Kacper");
        List.add("Andrzej");
        List.add("Zenon");
        List.add("Mateusz");
        List.add("Leon");
        List.add("Konrad");
        List.add("Michał");
        List.add("Artur");
        List.add("Grzegorz");
        Collections.sort(List);
        List.remove(0);
        for (String i : List)

            System.out.println(i);

    }

    public static class Zad9
    {
        public static void main(String[] args) {
            int[] Tab = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Podaj liczbę: ");
                Scanner scan = new Scanner(System.in);
                Tab[i] = (scan.nextInt());
                System.out.println("Liczba podniesiona do potęgi indeksu: " + Math.pow(Tab[i], i));
            }
        }
    }

    public static class Zad10
    {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj liczbę wierszy: ");
            int w = (scan.nextInt());
            System.out.print("Podaj liczbę kolumn: ");
            int k = (scan.nextInt());
            int[][]Tab = new int[w][k];

            for(int i=0; i<w; i++)
            {
                for(int j=0; j<k; j++)
                    Tab[i][j]=(i+1)*(j+1);
            }

            for(int i=0; i<w; i++)
            {
                for(int j=0; j<k; j++)
                    System.out.printf("%3d",Tab[i][j]);
                System.out.println();
            }

        }
    }

    public static class Zad11
    {
        public static void main(String[] args) {
            int[] Tab1 =new int [10];
            Arrays.fill(Tab1, 0);
            int[] Tab2 = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Podaj liczbę: ");
                Scanner scan = new Scanner(System.in);
                Tab2[i] = (scan.nextInt());
            }
            Arrays.sort(Tab1);
            Arrays.sort(Tab2);
        }
    }

    public static class Zad13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Map<String, Integer> Map = new HashMap<String, Integer>();
            Map.put("How much is 2 + 2?", 4);
            Map.put("How much is 54 * 4?", 216);
            Map.put("How much is 3 - 5?", -2);
            Map.put("What is the suffix of our course name? (Java...)", 101);
            Map.put("What is the current year?", 2023);
            Map.put("How old is the lecturer?", 21);
            int yes_no=0;
            int counter = 0;
            int answear;
            do
            {
                for (Map.Entry<String, Integer> i : Map.entrySet()) {
                    System.out.println(i.getKey());
                    answear = scan.nextInt();
                    if (answear == i.getValue())
                        counter++;
                }

                if ((counter*100/Map.size())>95)
                    System.out.println("Uzyskales ocene 6. Czy chcesz zagrac ponownie? (0/1) ");
                else if ((counter*100/Map.size())>85)
                    System.out.println("Uzyskales ocene 5. Czy chcesz zagrac ponownie? (0/1) ");
                else if ((counter*100/Map.size())>75)
                    System.out.println("Uzyskales ocene 4. Czy chcesz zagrac ponownie? (0/1) ");
                else if ((counter*100/Map.size())>65)
                    System.out.println("Uzyskales ocene 3. Czy chcesz zagrac ponownie? (0/1) ");
                else if ((counter*100/Map.size())>55)
                    System.out.println("Uzyskales ocene 2. Czy chcesz zagrac ponownie? (0/1) ");
                else System.out.println("Uzyskales ocene 1. Czy chcesz zagrac ponownie? (0/1) ");

                yes_no=scan.nextInt();
            }while(yes_no==1);

        }
    }
}
