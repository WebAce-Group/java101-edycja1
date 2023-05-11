package w3.zadania.JBar02;

import java.util.Scanner;

import static java.lang.Math.pow;

//Program  pobiera 10 liczb do tablicy i wyswietla je podniesione do potegi rownej indeksowi np.2^2, 5^5
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] tab =new int [10];
        int n=0;
        for (int i=0;i<10;i++) {
            System.out.println("Podaj zawartosc: " + i+" tablicy");
            n= scanner.nextInt();
            tab[i] = n;
        }
        for (int i=0;i<10;i++) {
            System.out.println("element " + (i+1) + " tablicy to: " + pow(tab[i], tab[i]));
        }
    }
}