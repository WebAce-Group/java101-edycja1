import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Zadanie13{
    public static void main(String[] args){
        Map<String, Integer> Mapa = new HashMap<>();
        int Answ;
        double pkt=0;
        Scanner scanner = new Scanner(System.in);
        int x=0;
        double srednia=0;

        Mapa.put("How much is the cost of the course?", 0);
        Mapa.put("How much is 2 + 2?", 4);
        Mapa.put("How much is 54 * 4?", 216);
        Mapa.put("How much is 3 - 5?", -2);
        Mapa.put("What is the suffix of our course name? (Java...)", 101);
        Mapa.put("What is the current year?", 2023);
        Mapa.put("How old is the lecturer?", 21);

        while(x!=10) {
            for (String key : Mapa.keySet()) {
                System.out.println(key);
                Answ = scanner.nextInt();
                if (Answ == Mapa.get(key)) {
                    pkt++;
                }
            }
            srednia=pkt/7;

                if (srednia > 0.95) {
                    System.out.println("Otrzymana ocena: 6");
                } 
                else if (srednia > 0.85) {
                    System.out.println("Otrzymana ocena: 5");
                } 
                else if (srednia > 0.75) {
                    System.out.println("Otrzymana ocena: 4");
                } 
                else if (srednia > 0.65) {
                    System.out.println("Otrzymana ocena: 3");
                }
                 else if (srednia > 0.55) {
                    System.out.println("Otrzymana ocena: 2");
                } 
                else {
                    System.out.println("Otrzymana ocena: 1");
                }
            pkt =0;
            System.out.println("--------------------------------");
            System.out.println("Jesli nie chcesz juz grac nacisnij 10 ");
            x = scanner.nextInt();
    }
  }
}