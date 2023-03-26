import java.util.HashMap;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args){
        HashMap<String, Integer> mapa = new HashMap<>();
        boolean graj = true;
        int odpowiedz,wynik=0;
        String x;
        Scanner scanner = new Scanner(System.in);
        mapa.put("How much is the cost of the course?",0);
        mapa.put("How much is 2 + 2?",4);
        mapa.put("How much is 54 * 4?",216);
        mapa.put("How much is 3 - 5?",-2);
        mapa.put("What is the suffix of our course name? (Java...)",101);
        mapa.put("What is the current year?",2023);
        mapa.put("How old is the lecturer?",21);
        while (graj){
            wynik=0;
            for (String pytanie: mapa.keySet()) {
                System.out.println(pytanie);
                odpowiedz=scanner.nextInt();
                if (mapa.get(pytanie)==odpowiedz){
                    wynik++;
                }
            }
            switch (wynik){
                case 1,2,3:
                    System.out.println("Ocena 1");
                    break;
                case 4:
                    System.out.println("Ocena 2");
                    break;
                case 5:
                    System.out.println("Ocena 3");
                    break;
                case 6:
                    System.out.println("Ocena 5");
                    break;
                case 7:
                    System.out.println("Ocena 6");
                    break;
            }
            scanner.nextLine();
            System.out.println("Czy chesz zagrać ponownie? Wpisz tak lub nie");
            x = scanner.nextLine();
            if (x.equals("nie")){
                graj=false;
            }


        }
    }
}
