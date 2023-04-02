import java.util.*;
public class Zadanie13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> pytanie = new HashMap<>();
        pytanie.put("How much is the cost of the course?", 0);
        pytanie.put("How much is 2 + 2?", 4);
        pytanie.put("How much is 54 * 4?", 216);
        pytanie.put("How much is 3 - 5?", -2);
        pytanie.put("What is the suffix of our course name? (Java...)", 101);
        pytanie.put("What is the current year?", 2023);
        pytanie.put("How old is the lecturer?", 21);
    boolean gra = true;
    while(gra == true){
        float wynik = 0;
        for (String pytanie_ : pytanie.keySet())
        {
            System.out.println(pytanie_);
            int odpowiedz = scanner.nextInt();
            if (pytanie.get(pytanie_) == odpowiedz){
                System.out.println("Poprawna odpowiedz.");
                wynik++;
            } else System.out.println("Zla odpowiedz.");
        }
        if((wynik/7.0)*100>95){
            System.out.println("Ocena 6");
        }else if((wynik/7.0)*100>=85){
            System.out.println("Ocena 5");
        }else if((wynik/7.0)*100>=75){
            System.out.println("Ocena 4");
        }else if((wynik/7.0)*100>=65){
            System.out.println("Ocena 3");
        }else if((wynik/7.0)*100>=55){
            System.out.println("Ocena 2");
        }else{
            System.out.println("Ocena 1");
        }
        System.out.println("Czy chcesz zagrać ponownie?");
        String wybor = scanner.next();
        if(wybor.equals("Nie")) gra = false;
    }
}
}