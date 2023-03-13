import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && i % (3*5) != 0) {
                System.out.println(i);
            }
        }
    }
}
