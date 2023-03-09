package w2.zadania.Nurek54;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;

        do {
            System.out.print("Podaj liczbę całkowitą: ");
            number = scanner.nextInt();

            if (number <= 100) {
                sum += number;
                count++;
            }

        } while (number <= 100);

        double average = (double) sum / count;
        System.out.println("Średnia arytmetyczna podanych liczb: " + average);
    }
}

