package w3.zadania.Tomoo3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("How much is the cost of the course?", 0);
        map.put("How much is 2+2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java ...", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

        double wynik = 0;
        int x = 0;
        Boolean flag = true;
        while (flag) {
            System.out.println("Odpowiedz na pytania");
            for (String i : map.keySet()) {
                if (x < 8) {
                    System.out.println(i);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Napisz odpowiedź do pytania: ");
                    int odpowiedz = scanner.nextInt();
                    if (map.get(i) == odpowiedz) {
                        wynik += 1;
                        x += 1;
                    } else {
                        System.out.println("Nieprawidłowa odpowiedź.");
                        x += 1;
                    }
                } else {
                    break;
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Jeżeli chcesz powtórzyć test napisz '1', jeśli nie, napisz '0': ");
            int powtorka = scanner.nextInt();
            if (powtorka == 0) {
                flag = false;
            } else {
                x = 0;
            }
        }
        double srednia = wynik/7;
        System.out.println(srednia);
        if(srednia > 0.95){
            System.out.println("Ocena 6");
        } else if(srednia < 0.95 && srednia > 0.85){
            System.out.println("Ocena 5");
        }else if(srednia < 0.85 && srednia > 0.75){
            System.out.println("Ocena 4");
        }else if(srednia < 0.75 && srednia > 0.65){
            System.out.println("Ocena 3");
        }else if(srednia < 0.65 && srednia > 0.55){
            System.out.println("Ocena 2");
        }else{
            System.out.println("Ocena 1");
        }
    }
}