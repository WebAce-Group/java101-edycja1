import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie13 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?",0);
        mapa.put("How much is 2 + 2?",4);
        mapa.put("How much is 54 * 4?",216);
        mapa.put("How much is 3 - 5?",-2);
        mapa.put("What is the suffix of our course name? (Java...)",101);
        mapa.put("What is the current year?",2023);
        mapa.put("How old is the lecturer?",21);

        boolean start = true;
        Scanner scanner = new Scanner(System.in);
        while (start == true){
            System.out.println("Wpisz 888 aby przerwac w dowolnym momencie");
            int wynik = 0;
            for (String key: mapa.keySet()){
                System.out.println(key);
                int k = scanner.nextInt();
                if (k == mapa.get(key)) wynik ++;
                if (k == 888){
                    start = false;
                    break;
                }
            }
            String ocena =  switch (wynik) {
                case 7->"6";
                case 6-> "5";
                case 5-> "2"; // nie wiem czy tu sie da zrobic np case wynik>5 -> "cos tam"
                default ->"1";
            };
            System.out.println("Ocena z twojego testu to: "+ocena);
        }
        scanner.close();   

        
        
        
    }
}
