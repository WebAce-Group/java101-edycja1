import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course? ", 0);
        mapa.put("How much is 2 + 2? ", 4);
        mapa.put("How much is 54 * 4? ", 216);
        mapa.put("How much is 3 - 5? ", -2);
        mapa.put("What is the suffix of our course name? (Java...)? ", 101);
        mapa.put("What is the current year? ", 2023);
        mapa.put("How old is the lecturer? ", 21);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int points = 0;
            for (String i: mapa.keySet()) {
                System.out.printf(i);
                int answer = scanner.nextInt();
                if (answer == mapa.get(i)) points++;
            }

            int grade = switch (points) {
                case 7 -> 6;
                case 6 -> 5;
                case 5-> 3;
                case 4 -> 2;
                case 3,2,1,0 -> 1;
                default -> 0;
            };

            System.out.println("\nGrade - " + grade);
            System.out.println("Do you want to play again? yes/no");
            String again = scanner.next();
            
            if (again.equals("no")) break;
        }
        scanner.close();

    } 
}
