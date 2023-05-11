package org.example;
import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        double x; //liczba którą podajemy
        double s; //suma liczb
        double y; //średnia liczb
        double i=1; //ilość podanych liczb
        double z=0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            x = scanner.nextInt();

            s=x+z;
            y=s/i;

            System.out.println("średnia podanych liczb: "+y);
            System.out.println(" ");

            z=s;
            i++;

        }while(x<100);
    }
}