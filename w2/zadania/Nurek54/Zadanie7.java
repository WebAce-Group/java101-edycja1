package w2.zadania.Nurek54;
import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Podaj liczbę całkowitą mniejszą od 100: ");
            int number = input.nextInt();

            if (number < 100) {
                sum += number;
                count++;
                break;
            } else {
                System.out.println("Podana liczba jest >= 100. Spróbuj ponownie.");
            }
        }

        while (true) {
            System.out.print("Podaj kolejną liczbę całkowitą: ");
            int number = input.nextInt();

            if (number < 100) {
                sum += number;
                count++;
            } else {
                System.out.println("Podana liczba jest >= 100. Spróbuj ponownie.");
            }

            if (count > 0 && number >= 100) {
                break;
            }
        }

        double average = (double) sum / count;
        System.out.println("Średnia arytmetyczna podanych liczb to: " + average);
    }
}
