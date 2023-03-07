import static java.lang.Math.*;

public class Zadanie2 {

    public static void  main(String [] args){

        int a=5, b=10;
        double c=Math.pow(a,b);
        double d=sqrt(c);

        System.out.println("a= " + a + " b=" + b + " c=" + c + " d=" + d);

        int e=-5;
        double g=abs(e);
        double h=10.5001;
        System.out.println(round(h));

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d +" e=" + e + " g=" + g + " h=" + h );


    }

}
