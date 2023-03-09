import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = n; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 != 0 || i % 5 != 0)
                    System.out.print(i + " ");
            }
        }

    }
}