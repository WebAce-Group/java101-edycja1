package w2.zadania.MatiBukowski;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=100; i++) {
            if(i%3 == 0) {
                System.out.print(i + " ");
                continue;
            }
            if(i==50)
                break;
        }
    }
}
