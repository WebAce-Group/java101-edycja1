import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isRunning = true;
        int sum = 0;

        while (isRunning) {
           n = scanner.nextInt();
           sum += n;
           if (n == 0) {
               isRunning = false;
           }
        }

        System.out.println(sum);
    }
}
