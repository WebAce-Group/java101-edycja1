package w2.zadania.alekd77;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int userInput;
        int sum = 0;
        int loopCount = 0;

        do {
            System.out.println("Podaj liczbe calkowita (wpisz liczbe <= 100 aby wyjsc):");
            userInput = scanner.nextInt();
            sum += userInput;
            ++loopCount;
        } while (userInput > 100);

        final double avg = (double) sum / loopCount;

        System.out.printf("Srednia wprowadzonych liczb to: %.2f", avg);
    }
}
