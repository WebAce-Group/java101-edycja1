package w2.Zadania.JBar02;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=1, suma=0;
        boolean flag =true;
        while(n!=0){
            System.out.println("podaj liczbe: ");
            n= scanner.nextInt();
            suma+=n;
        }
        System.out.println("Suma podanych liczb: " + suma);
    }
}