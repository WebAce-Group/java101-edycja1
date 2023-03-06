import java.util.Scanner;

public class Z5 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i+" ");
            }
        System.out.print("\n W dół: \n");
        for (int j = n; j >= 0; j--) {
            System.out.print(j+" ");
        }
        System.out.println("\npodzielne przez 3 lub przez 5");
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(ANSI_YELLOW+"\n Podzielne przez 3 lub 5 ale nie obie"+ANSI_RESET);
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5!=0 || i % 5 == 0 && i % 3 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
