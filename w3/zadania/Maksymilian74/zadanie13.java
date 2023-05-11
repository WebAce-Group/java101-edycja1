package w3.zadania.Maksymilian74;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("How much is the cost of the course?",0);
        mapa.put("How much is 2 + 2?",4);
        mapa.put("How much is 54 * 4?",216);
        mapa.put("How much is 3 - 5?",-2);
        mapa.put("What is the suffix of uor course name? (Java...)",101);
        mapa.put("What is the current year?",2023);
        mapa.put("How old is the lecturer?",21);
        int czy,tmp;
        do{
            int pkt=0;
            System.out.println("Witam w grze!");
            for(Map.Entry<String,Integer> entry : mapa.entrySet()){
                System.out.println(entry.getKey());
                tmp = scanner.nextInt();
                if(tmp == entry.getValue())
                    pkt++;
            }
            System.out.println("Twój wynik to: " + pkt + " punktów!");
            //pkt = pkt/7*100;
            switch(pkt){
                case 7:
                    System.out.println("Twoja ocena to: 6!");
                    break;
                case 6:
                    System.out.println("Twoja ocena to: 5!");
                    break;
                case 5:
                    System.out.println("Twoja ocena to: 3!");
                    break;
                case 4:
                    System.out.println("Twoja ocena to: 2!");
                    break;
                default:
                    System.out.println("Twoja ocena to: 1!");
                    break;
            }
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("Jeśli chcesz zagrać jeszcze raz wpisz 1");
            System.out.println("Jeśli chcesz zakończyć grę wpisz 0");
            czy = scanner.nextInt();
            System.out.println("---------------------------------------");
        }while(czy!=0);


    }
}
