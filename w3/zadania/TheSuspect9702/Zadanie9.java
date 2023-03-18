package w3.zadania.TheSuspect9702;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.print("Podaj liczbe numer " + (i+1) + " :");
            arr[i] = scan.nextInt();
        }
        int c = 0;
        for (int a : arr){
            System.out.println(Math.pow(a,c));
            c++;
        }
    }
}

