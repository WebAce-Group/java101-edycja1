package w2.Zadania.andrzejk00;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cout = 0;
        int value;
        double result = 0;
        do {
            System.out.print("Podaj liczbe: ");
            value = scanner.nextInt();
            cout++;
            result += value;
        }while(value < 100);
        System.out.println();
        System.out.println("srednia arytmetyczna podanych liczb " + result/cout);
    }
}
