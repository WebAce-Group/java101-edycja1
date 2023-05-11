package org.example;
import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie9 {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        for(int i=0;i<10;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int x = scanner.nextInt();
            tablica[i]=x;
        }

        System.out.println(" ");

int i = 0;
        for(int x : tablica){ //podnoszenie do potęgi
            System.out.println(x+ " podniesione do " + i + " = "+  pow(x, i));
            i++;
        }

        System.out.println(" ");
        System.out.print("Liczby w tablicy: ");

        for(int e:tablica) {
            System.out.print(e + " ");
        }
    }
}