import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych bokow można zbudować trojkat");
        } else {
            System.out.println("Z podanych bokow nie można zbudować trojkata");
        }
        if (a==b && b==c) {
            System.out.println("Trojkat jest rownoboczny");
        } else if (a==b || b==c || a==c) {
            System.out.println("Trojkat jest rownoramienny");
        } else {
            System.out.println("Trojkat jest roznoboczny");
        }

    }
}
