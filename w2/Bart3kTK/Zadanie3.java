import java.util.Scanner;


public class Zadanie3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 boki trojkata o dlugosci calkowitej");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
         
        if (a+b>c || b+c > a || a+c>b){
            int maks = Math.max(a,Math.max(b,c)); //zaleznosc ze max(a,b,c) to max(a,max(b,c))
            int mini = Math.min(a,Math.min(b,c)); //zaleznosc ze min(a,b,c) to min(a,min(b,c))
            int srodkowa = a+b+c - maks - mini;
            //System.out.println(maks); System.out.println(srodkowa); System.out.println(mini);
            if (maks == mini)
                System.out.println("Z podanych bokow da sie zbudowac trojkat rownoboczny");
            else if (maks == srodkowa || mini == srodkowa)
                System.out.println("Z podanych bokow da sie zbudowac trojkat rownoramienny");
            else System.out.println("Z podanych bokow da sie zbudowac trojkat roznoboaczny");
        }else System.out.println("Z podanych bokow nie da sie zbudowac trojkata");


    }
}