package w2.Zadania.JBar02;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a,b,c, max, x = 0;

        System.out.println("Podaj pierwszy bok trojkata: ");
         a = scanner.nextInt();
        System.out.println("Podaj drugi bok trojkata: ");
        b = scanner.nextInt();
        System.out.println("Podaj trzeci bok trojkata: ");
        c = scanner.nextInt();
        max = a ;
        if(max<b)max=b;
        if(max<c)max=c;
        if(max<a+b+c-max) {System.out.println(" można utworzyc trojkat");
        x=1;
        }
        else System.out.println("nie mozna utworzyc trójkata");


          if (a==b && b==c && x==1) {System.out.println("trojkat rownoboczny");}
            else if (a==b || b==c && x==1) {System.out.println("trojkat rownoramienny");}
                    else if(a!=b && b!=c && x==1) {System.out.println("roznoboczny");}

    }
}