package w3.zadania.MaksymilianWis;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args){
        Map<String, Integer> mapa = new HashMap<String, Integer>();

        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

        float points=0;
        for(Map.Entry<String, Integer> x:mapa.entrySet())
        {
            System.out.println(x.getKey());
            Scanner scan = new Scanner(System.in);

            System.out.println(points);
            points += scan.nextInt()==x.getValue() ? 1:0;
            //scan.close(); //wywala błąd nmg zamknąć scan
        }
        //scan.close(); //poza zakrersem scannera nmg zamknąć, jak ży co robić? odp: działa to nie ruszaj nie wszystko musi być na zielono, ale boli
        points = points/7*100;
        System.out.println(points);
        if(points>=95) System.out.println("ocena: 6");
        else if(points>85) System.out.println("ocena: 5");
        else if(points>=75) System.out.println("ocena: 4");
        else if(points>=65) System.out.println("ocena: 3");
        else if(points>=55) System.out.println("ocena: 2");
        else if(points<55) System.out.println("ocena: 1");

    }
}
