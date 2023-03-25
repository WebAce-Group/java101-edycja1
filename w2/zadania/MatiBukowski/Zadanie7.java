package w2.zadania.MatiBukowski;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int pom = 0; //zmienna pomocnicza
        double srednia = 0;
        int suma =0;

        do {
            System.out.println("Podaj liczbę: ");
            a = scanner.nextInt();
            pom++;
            suma = suma+a;
            srednia = (double) suma/pom;
        } while(a<=100);
        System.out.println(srednia);

    }
}
