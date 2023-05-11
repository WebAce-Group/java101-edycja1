import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie13{
    public static void main(String[] args){
    Map<String, Integer> Mapa = new HashMap<>();
    int Answer;
    double pkt=0;
    Scanner scan = new Scanner(System.in);
    int n=0;
    double avrage=0;

        Mapa.put("How much is the cost of the course?", 0);
        Mapa.put("How much is 2 + 2?", 4);
        Mapa.put("How much is 54 * 4?", 216);
        Mapa.put("How much is 3 - 5?", -2);
        Mapa.put("What is the suffix of our course name? (Java...)", 101);
        Mapa.put("What is the current year?", 2023);
        Mapa.put("How old is the lecturer?", 21);

        while(n!=8) {
        for (String key : Mapa.keySet()) {
            System.out.println(key);
            Answer = scan.nextInt();
            if (Answer == Mapa.get(key)) {
                pkt++;
            }
        }
        avrage=pkt/7;
                if (avrage > 0.95) {
        System.out.println("Mark: 6");
    }
                else if (avrage> 0.85) {
        System.out.println("Mark: 5");
    }
                else if (avrage> 0.75) {
        System.out.println("Mark: 4");
    }
                else if (avrage> 0.65) {
        System.out.println("Mark: 3");
    }
                 else if (avrage> 0.55) {
        System.out.println("Mark: 2");
    }
                else {
        System.out.println("Mark: 1");
    }
    pkt =0;

    }
  }
}
