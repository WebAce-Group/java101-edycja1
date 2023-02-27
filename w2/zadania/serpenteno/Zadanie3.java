import java.util.Scanner;

public class Zadanie3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj boki trójkąta: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Nie można utworzyć trójkąta :(");
        } else if (a==b && a==c) {
            System.out.println("Trójkąt równoboczny");
        } else if (a!=b && a!=c && b!=c) {
            System.out.println("Trójkąt różnoboczny");
        } else {
            System.out.println("Trójkąt równoramienny");
        }
    }
}
