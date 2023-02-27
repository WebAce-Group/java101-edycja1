import java.util.Scanner;

public class Zadanie3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj boki trojkata: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Nie mozna utworzyc trojkata :(");
        } else if (a==b && a==c) {
            System.out.println("Trojkat rownoboczny");
        } else if (a!=b && a!=c && b!=c) {
            System.out.println("Trojkat roznoboczny");
        } else {
            System.out.println("Trojkat rownoramienny");
        }
    }
}
