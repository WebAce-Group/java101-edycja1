package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);

        double d=0;
        boolean a=true;
        while(a==true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Czy chciałbyś zagrać w grę? (tak = 1, nie = 0)");
            int b = scanner.nextInt();
            if(b==1) {
                for (String z : mapa.keySet()) {
                    System.out.println(z);
                    int c = scanner.nextInt();

                    if(mapa.get(z)==c){
                        d++;
                        System.out.println("dobra odpowiedź, zdobywasz punkt!");
                        System.out.println(" ");
                    }else{
                        System.out.println("zła odpowiedź");
                        System.out.println(" ");
                    }
                }

                System.out.println("uzyskujesz ocenę: " );
                if(d/7 > 0.95){
                    System.out.println("6");
                }else if (d/7 > 0.85){
                    System.out.println("5");
                }else if (d/7 > 0.75){
                    System.out.println("4");
                }else if (d/7 > 0.65){
                    System.out.println("3");
                }else if (d/7 > 0.55){
                    System.out.println("2");
                }else if (d/7 < 0.55){
                    System.out.println("1");
                }

            }else {
                a=false;
            }

        }
    }
}