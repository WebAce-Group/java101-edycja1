import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        boolean czy = true;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (czy) {
            System.out.println("Podaj liczbę całkowitą: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            sum ++;
            if (n == 0) czy = false;
        }
        scanner.close();
        System.err.println("");
        System.out.println(sum);
    }
}
