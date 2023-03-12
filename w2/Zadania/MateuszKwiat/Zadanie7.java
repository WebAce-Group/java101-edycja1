import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        int sum = 0;

        do {
            n = scanner.nextInt();
            if (n <= 100) {
                sum += n;
                count++;
            }
        } while (n <= 100);

        System.out.println(n/count);
    }
}
