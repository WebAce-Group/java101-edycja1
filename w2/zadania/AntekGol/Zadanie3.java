import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszy bok: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugi bok: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzeci bok: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych boków można zbudować trójkąt.");
            if (a == b && b == c) {
                System.out.println("Trójkąt jest równoboczny.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Trójkąt jest równoramienny.");
            } else {
                System.out.println("Jest to normalny trójkąt");
            }
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }
    }

}
