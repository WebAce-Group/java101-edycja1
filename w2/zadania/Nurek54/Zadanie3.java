package w2.zadania.Nurek54;
import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długości trzech boków trójkąta:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych boków można zbudować trójkąt.");

            if (a == b && b == c) {
                System.out.println("Trójkąt jest równoboczny.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Trójkąt jest równoramienny.");
            } else {
                System.out.println("Trójkąt jest różnoboczny.");
            }
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }
    }
}
