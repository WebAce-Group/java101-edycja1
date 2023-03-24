import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        int sum = 0;

        while (condition) {
            int num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                condition = false;
            }
        }
        System.out.println("Suma = " + sum);
    }
}
