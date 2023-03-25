package w3.zadania.Viborcia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

        int odp;
        double pkt=0;
        Scanner scanner = new Scanner(System.in);
        int p=1;

        while(p==1) {
            for (String key : mapa.keySet()) {
                System.out.println(key);
                odp = scanner.nextInt();
                if (odp == mapa.get(key)) {
                    pkt++;
                }
            }

            System.out.print("Twoja ");
                if (pkt/7 > 0.95) {
                    System.out.println("Ocena to 6");
                } else if (pkt/7 > 0.85) {
                    System.out.println("Ocena to 5");
                } else if (pkt/7 > 0.75) {
                    System.out.println("Ocena to 4");
                } else if (pkt/7 > 0.65) {
                    System.out.println("Ocena to 3");
                } else if (pkt/7 > 0.55) {
                    System.out.println("Ocena to 2");
                } else {
                    System.out.println("Ocena to 1");
                }

            scanner.nextLine();
            System.out.println("Chcesz zagrac ponownie? Jezeli tak nacisniej 1. ");
            p = scanner.nextInt();
            pkt = 0;
        }
    }
}
