import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        boolean czy = true;
        int sum = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        while (czy) {
            System.out.println("Podaj liczbę całkowitą: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            num ++;
            sum += n;
            if (n > 100) czy = false;
        }
        scanner.close();
        System.err.println("");
        System.out.println((float)sum / (float)num);
    }
}
