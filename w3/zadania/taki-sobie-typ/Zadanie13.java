import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args){
        int wynik=0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pytania = new HashMap<>();

        pytania.put("How much is the cost of the course?", 0);
        pytania.put("How much is 2 + 2?", 4);
        pytania.put("How much is 54 * 4?", 216);
        pytania.put("How much is 3 - 5?", -2);
        pytania.put("What is the suffix of our course name? (Java...)", 101);
        pytania.put("What is the current year?", 2023);
        pytania.put("How old is the lecturer?", 21);

        boolean warunek = true;
        while (warunek){

            for(String element : pytania.keySet()){
                System.out.print(element+" : ");
                if(scanner.nextInt()==pytania.get(element)){
                    wynik++;
                }
            }

            switch (wynik){
                case 7 -> System.out.println("Brawo 6");
                case 6 -> System.out.println("Brawo 5");
                case 5 -> System.out.println("Brawo 4");
                case 4 -> System.out.println("Brawo 3");
                case 3 -> System.out.println("Brawo 2");
                default -> System.out.println("Postaraj sie lepiej 1");
            }
            wynik = 0;

            System.out.print("Aby zagrac ponownie wprowadz 1: ");
            if(scanner.nextInt()!=1) warunek = false;
        }


    }
}
