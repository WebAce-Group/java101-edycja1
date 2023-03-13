import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        for (int i = 1; i <= liczba; i++) {
            System.out.println(i);
        }
        for (int i = liczba; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= liczba; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }}

        for (int i = 1; i <= liczba; i++) {
            if ((i % 3 == 0 && i % 5 != 0) || (i % 3 != 0 && i % 5 == 0)) {
                System.out.println(i);
            }
            }
        }

}
