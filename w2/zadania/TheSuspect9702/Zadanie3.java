package w2.zadania.TheSuspect9702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> boki = new ArrayList<>();
        System.out.println("Podaj boki trójkąta: ");
        for (int i =0; i<3; i++) {
            System.out.print("Bok numer " + i + ": ");
            boki.add(scan.nextInt());
        }
        if ((boki.get(0) + boki.get(1) <= boki.get(2)) || (boki.get(0) + boki.get(2)<=boki.get(1))
                || (boki.get(1) + boki.get(2)<=boki.get(0)) || boki.get(0)<0 || boki.get(1)<0 || boki.get(2)<0){
            System.out.println("Z podanych boków nie można stworzyć trójkąta");
        }
        else {
            HashMap<Integer,Integer> rodzaj = new HashMap<>();
            for(Integer a : boki)
                rodzaj.put(a,0);
            for(Integer a : boki)
                rodzaj.put(a,rodzaj.get(a)+1);
            if(rodzaj.containsValue(2))
                System.out.println("Trójkąt jest równoramienny");
            else if(rodzaj.containsValue(3))
                System.out.println("Trójkąt jest równoboczny");
        }
    }
}
