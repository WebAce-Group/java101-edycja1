import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bok a:");
        int a = scanner.nextInt();
        System.out.println("Bok b:");
        int b = scanner.nextInt();
        System.out.println("Bok c:");
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Trojkat rownoboczny.");
            }
            else if (a == b || b == c || c == a) {
                System.out.println("Trojkat rownoramienny.");
            }
            else {
                System.out.println("Trojkat roznoboczny.");
            }
        }
        else {
            System.out.println("Z bokow tej dlugosci nie da sie stworzyc trojkata.");
        }
    }
}