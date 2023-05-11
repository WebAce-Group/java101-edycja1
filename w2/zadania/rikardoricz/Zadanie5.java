import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int num = scanner.nextInt();

        System.out.println("od 1 do n:");
        for (int i = 1; i <= num; i++)
            System.out.print(i + " ");
        System.out.print("\n");

        System.out.println("od n do 1:");
        for (int i = num; i > 0; i--)
            System.out.print(i + " ");
        System.out.print("\n");

        System.out.println("od 1 do n (podzielne przez 3 lub 5):");
        for (int i = num; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.print("\n");

        System.out.println("od 1 do n (podzielne przez 3 lub 5, ale nie jednoczesnie przez oba):");
        for (int i = num; i > 0; i--)
            if ((i % 3 == 0 || i % 5 == 0) && i % 15 != 0)
                System.out.print(i + " ");
        System.out.print("\n");
    }
}
