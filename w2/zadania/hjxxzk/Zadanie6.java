package w2.zadania.hjxxzk;
import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        boolean test = true;

        Scanner scanner = new Scanner(System.in);

        int num, sum = 0;

        while(test) {

            System.out.println("Podaj liczbę: ");
            num = scanner.nextInt();

            sum += num;

            if(num == 0)
                test = false;

        }

        System.out.println("Suma liczb wynosi: " + sum);
    }
}