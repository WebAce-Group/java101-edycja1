import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj bok a:");
    int a = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Podaj bok b:");
    int b = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Podaj bok c:");
    int c = scanner.nextInt();
    scanner.nextLine();

    if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Trójkąt jest równoboczny.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Trójkąt jest równoramienny.");
            } else {
                System.out.println("Trójkąt jest różnoboczny.");
            }
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }


    }
}
