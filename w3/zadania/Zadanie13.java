import java.util.*;

public class Zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);
        int koniec = 0;
        int wynik = 0;
        int pom;
        while(koniec == 0){
            for (Map.Entry<String, Integer> question : mapa.entrySet()) {
                System.out.println(question.getKey());
                pom = sc.nextInt();
                if(pom == question.getValue()){
                    wynik++;
                }
            }
            if(wynik == 4){
                System.out.println("Ocena: 2");
            } else if(wynik == 5){
                System.out.println("Ocena: 3");
            } else if(wynik == 6){
                System.out.println("Ocena: 5");
            } else if(wynik == 7){
                System.out.println("Ocena: 6");
            } else {
                System.out.println("Ocena: 1");
            }
            wynik = 0;
            System.out.println("Czy chcesz zagrać jeszcze raz?(1 - tak, 0 - nie):");
            pom = sc.nextInt();
            if(pom == 0){
                koniec = 1;
                System.out.println("Do zobaczenia!");
            }
        }

    }
}
