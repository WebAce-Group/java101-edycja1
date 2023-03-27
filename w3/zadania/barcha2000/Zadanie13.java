import java.util.Scanner;
import java.util.HashMap;


public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?",4);
        mapa.put("How much is 54 * 4?",216);
        mapa.put("How much is 3 - 5?",-2);
        mapa.put("What is the suffix of our course name? (Java...)",101);
        mapa.put("What is the current year?",2023);
        mapa.put("How old is the lecturer?",21);
        boolean t = true;
        while(t = true){
            int wynik = 0;
            for(String pytanie:mapa.keySet()){
                System.out.println(pytanie);
                System.out.println("\n");
                int odp = scanner.nextInt();
                if(odp == mapa.get(pytanie)){
                    wynik += 1;
                }
            }
            if(wynik/mapa.size() > 0.95){
                System.out.println("Dostajesz ocene 6");
            }
            else if(wynik/mapa.size() > 0.85){
                System.out.println("Dostajesz ocene 5");
            }
            else if(wynik/mapa.size() > 0.75){
                System.out.println("Dostajesz ocene 4");
            }
            else if(wynik/mapa.size() > 0.65){
                System.out.println("Dostajesz ocene 3");
            }
            else if(wynik/mapa.size() > 0.55){
                System.out.println("Dostajesz ocene 2");
            }
            else{
                System.out.println("Dostajesz ocene 1");
            }
            System.out.printf("Jesli chcesz zagrac ponownie nacisnij 1, jesli nie to wybierz dowowlna inna liczbe calkowita");
            int odp = scanner.nextInt();
            if(odp != 1){
                t = false;
            }
        }
    }
}