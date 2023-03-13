package w2.zadania.alekd77;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean isRepetition = true;
        int sum = 0;

        while (isRepetition) {
            System.out.println("Podaj liczbe calkowita (wpisz 0 aby wyjsc): ");
            int userInput = scanner.nextInt();

            sum += userInput;

            if (userInput == 0) {
                isRepetition = false;
            }
        }

        System.out.printf("Suma podanych liczb: %d", sum);
    }
}
