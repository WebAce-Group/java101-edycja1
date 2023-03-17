package w2.zadania.Nurek54;
import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int sum = 0;

        while (flag) {
            System.out.print("Podaj liczbę całkowitą (0 kończy program): ");
            int number = input.nextInt();

            if (number == 0) {
                flag = false;
            } else {
                sum += number;
            }
        }

        System.out.println("Suma podanych liczb: " + sum);
    }
}
