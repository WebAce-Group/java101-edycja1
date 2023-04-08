import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

    int graj;
        while (true) {
            int wynik=0;
            for (String element : mapa.keySet()) {
                System.out.print(element + " : ");
                if (scanner.nextInt() == mapa.get(element)) {
                    wynik++;
                }
            }

            switch (wynik) {

                case 3:
                    System.out.println("masz 2");
                    break;
                case 4:
                    System.out.println("masz 3");
                    break;
                case 5:
                    System.out.println("masz 4");
                    break;
                case 6:
                    System.out.println("masz 5");
                    break;
                case 7:
                    System.out.println("masz 6");
                    break;
                default:
                    System.out.println("masz 1");
            }
            System.out.println("Chesz zagrac jeszcze raz? 1= TAK , 0 = NIE ");
            graj = scanner.nextInt();
            switch (graj){
                case 0:
                    return;

                case 1:
                    continue;
                default:
                    System.out.println("wybrales zle");
            }
        }
    }
}
