import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj bok A: ");
        int a = scanner.nextInt();

        System.out.print("Podaj bok B: ");
        int b = scanner.nextInt();

        System.out.print("Podaj bok C: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) System.out.println("Trójkąt jest równoboczny.");
            else if (a == b || a == c || b == c) System.out.println("Trójkąt jest równoramienny.");
            else System.out.println("Trójkąt jest.");
        } else System.out.println("Trójkąta nie da się zbudować z podanych boków.");
    }
}
