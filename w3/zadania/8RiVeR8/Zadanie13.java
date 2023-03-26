import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gra=1;
        while(gra==1){
            Map<String, Integer> pytanie = new HashMap<>();
            int k;
            double punkty=0;
            pytanie.put("How much is the cost of the course?", 0);
            pytanie.put("How much is 2 + 2?", 4);
            pytanie.put("How much is 54 * 4?", 216);
            pytanie.put("How much is 3 - 5?", -2);
            pytanie.put("What is the suffix of our course name? (Java...)", 101);
            pytanie.put("What is the current year?", 2023);
            pytanie.put("How old is the lecturer?", 21);

            for (String map: pytanie.keySet()) {
                System.out.println(map);
                k = scanner.nextInt();
                if(k==pytanie.get(map)){
                    System.out.println("Prawidłowa odpowiedź");
                    punkty++;
                }else{
                    System.out.println("Zła odpowiedź");
                }
            }

            if((punkty/7.0)*100>95){
                System.out.println("ocena 6");
            }else if((punkty/7.0)*100>=85){
                System.out.println("ocena 5");
            }else if((punkty/7.0)*100>=75){
                System.out.println("ocena 4");
            }else if((punkty/7.0)*100>=65){
                System.out.println("ocena 3");
            }else if((punkty/7.0)*100>=55){
                System.out.println("Ocena 2");
            }else{
                System.out.println("Ocena 1");
            }
            System.out.println("Czy chcesz zagrać ponownie? 1-Tak 0-Nie");
            gra=scanner.nextInt();
        }

    }
}
