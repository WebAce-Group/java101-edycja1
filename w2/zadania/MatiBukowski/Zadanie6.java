package w2.zadania.MatiBukowski;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        int b = 1;
        int suma = 0;

        while(b!=0) {
            System.out.print("Podaj liczbę: ");
            b = scanner.nextInt();
            suma = suma + b;
        }
        System.out.println(suma);
    }

}
