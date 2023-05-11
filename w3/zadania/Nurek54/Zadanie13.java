package w3.zadania.Nurek54;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean grajPonownie = true;

        while (grajPonownie) {
            Map<String, Integer> pytania = new HashMap<>();
            wypelnijPytania(pytania);

            int wynik = 0;
            for (Map.Entry<String, Integer> entry : pytania.entrySet()) {
                System.out.println(entry.getKey());
                int odpowiedzUzytkownika = scanner.nextInt();
                if (odpowiedzUzytkownika == entry.getValue()) {
                    wynik++;
                }
            }
            int procentowyWynik = (int) (((double) wynik / pytania.size()) * 100);

            System.out.println("Twój wynik: " + wynik + "/" + pytania.size() + " (" + procentowyWynik + "%)");

            if (procentowyWynik > 95) {
                System.out.println("Ocena: 6");
            } else if (procentowyWynik > 85) {
                System.out.println("Ocena: 5");
            } else if (procentowyWynik > 75) {
                System.out.println("Ocena: 4");
            } else if (procentowyWynik > 65) {
                System.out.println("Ocena: 3");
            } else if (procentowyWynik > 55) {
                System.out.println("Ocena: 2");
            } else {
                System.out.println("Ocena: 1");
            }

            System.out.println("Czy chcesz zagrać ponownie? (Tak/Nie)");
            String odpowiedz = scanner.next().toLowerCase();
            if (!odpowiedz.equals("tak")) {
                grajPonownie = false;
            }
        }

        System.out.println("Dziękuję za grę!");
    }

    private static void wypelnijPytania(Map<String, Integer> pytania) {
        pytania.put("How much is the cost of the course?", 0);
        pytania.put("How much is 2 + 2??", 4);
        pytania.put("How much is 54 * 4?", 216);
        pytania.put("How much is 3 - 5?", -2);
        pytania.put("What is the suffix of our course name? (Java...)", 101);
        pytania.put("What is the current year?", 2023);
        pytania.put("How old is the lecturer?", 21);
    }
}
