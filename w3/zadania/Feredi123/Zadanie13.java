import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("grusHow much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("What is the current year?", 2023);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("How old is the lecturer?", 21);

        boolean czyJeszczeRaz = true;

        while (czyJeszczeRaz){
            int punkty  = 0;

            for (Map.Entry<String, Integer> pytanie : mapa.entrySet() ){
                System.out.println( pytanie.getKey() );
                int odpowiedz = scanner.nextInt();
                if (odpowiedz == pytanie.getValue()){
                    punkty++;
                    System.out.println("Gratulacje, dobra odpowiedź. Twoja liczba punktów to: " + punkty);
                }
                else {
                    System.out.println("Poprawna odpwiedź to: " + pytanie.getValue() + ". Twoja liczba punktów to: " + punkty);
                }
            }

            System.out.print("Otrzymujesz Ocenę: ");

            switch (punkty){
                case 0,1,2,3: System.out.println("1");
                        break;
                case 4:
                    System.out.println("2");
                    break;
                case 5:
                    System.out.println("3");
                    break;
                case 6:
                    System.out.println("5");
                    break;
                case 7:
                    System.out.println("6");
                    break;

            }

            System.out.println("Chcesz zagrać jeszce raz? 1/0");
            if( scanner.nextInt() == 0 ) czyJeszczeRaz = false;

        }
    }
}
