package w1.zadania.PullPushSingar;

import java.lang.Math;

public class Zadanie2 {

    public static void main(String[] args) {
        int a = 5 ,b = 10;
        double c,d;
        int e = -5;
        double g,h,roundh;

        c = Math.pow(a,b);
        d = Math.sqrt(c);

        g = Math.abs(e);
        h = 10.5001;

        roundh = Math.round(h);

        System.out.println("Wartość zmiennej a to : " + a);
        System.out.println("Wartość zmiennej b to : " + b);
        System.out.println("Wartość zmiennej c to : " + c);
        System.out.println("Wartość zmiennej d to : " + d);
        System.out.println("Wartość zmiennej g to : " + g);
        System.out.println("Wartość zmiennej h (przed zaokrągleniem) to : " + h);
        System.out.println("Wartość zmiennej h (po zaokrągleniu) to : " + roundh);


    }

}
