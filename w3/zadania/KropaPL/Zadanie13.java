import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> pytania = new HashMap<>();
        pytania.put("How much is the cost of the course?", 0);
        pytania.put("How much is 2 + 2?", 4);
        pytania.put("How much is 54 * 4", 216);
        pytania.put("How much is 3 - 5?", -2);
        pytania.put("What is the suffix of our course name? (Java...)", 101);
        pytania.put("What is the current year?", 2023);
        pytania.put("How old is the lecturer?", 21);

        int odp;

        for (; ; ) {
            int wynik = 0;
            System.out.println("Odpowiedz na pytania: ");
            for (Map.Entry<String, Integer> entry : pytania.entrySet()) {
                System.out.println(entry.getKey());
                odp = scan.nextInt();
                if (odp == entry.getValue()) {
                    wynik++;
                }
            }
            System.out.println("Twój wynik to: " + wynik + "/7");
            switch (wynik) {
                case 7:
                    System.out.println("Twoja ocena to 6");
                    break;
                case 6:
                    System.out.println("Twoja ocena to 5");
                    break;
                case 5:
                    System.out.println("Twoja ocena to 4");
                    break;
                case 4:
                    System.out.println("Twoja ocena to 3");
                    break;
                case 3:
                    System.out.println("Twoja ocena to 2");
                    break;
                case 2, 1, 0:
                    System.out.println("Twoja ocena to 1");
                    break;
            }
            System.out.println("Czy chcesz spróbować ponownie?");
            System.out.println("Tak - 1");
            System.out.println("Nie - 0");
            odp = scan.nextInt();

            if (odp == 0) break;
        }

    }
}