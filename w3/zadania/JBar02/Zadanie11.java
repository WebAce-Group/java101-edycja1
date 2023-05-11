package w3.zadania.JBar02;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]Tab= new int [10];
        Arrays.fill(Tab,0);//wypelniam tablice zerami

        int[]Tab1= new int [10];
        for(int i=0;i<10;i++){
            Tab1[i]= scanner.nextInt();
        }

        Arrays.sort(Tab);
        Arrays.sort(Tab1);//sortowanie od najmniejszego do najwiekszego
        for(int i=0;i<10;i++) {
            System.out.println(Tab1[i] + " ");
        }
    }
}