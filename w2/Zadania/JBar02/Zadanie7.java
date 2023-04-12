package w2.Zadania.JBar02;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=1, suma=0, ileLiczb=0;
        boolean flag =true;
        do{
            System.out.println("podaj liczbe: ");
            n= scanner.nextInt();
            suma+=n;
            ileLiczb+=1;
        }
        while(n<=100);
        System.out.println("srednia podanych liczb: " + suma/ileLiczb);
    }
}