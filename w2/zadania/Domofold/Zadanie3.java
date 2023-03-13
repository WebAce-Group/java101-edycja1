import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3;i++) {
            System.out.println("Podaj bok trójkąta: ");
            if (i == 0) a = scanner.nextInt();
            if (i == 1) b = scanner.nextInt();
            if (i == 2) c = scanner.nextInt();
            scanner.nextLine();
            
        }
        scanner.close();
        if (a < b+c && b < a+c && c < b+a ) {
            if (a == b && b == c) {
                System.out.println("Trójkąt jest równoboczny.");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("Trójkąt jest równoramienny.");
            }
            else if (a != b && b!=c) {
                System.out.println("Trójkąt jest różnoboczny.");
            }
        }
        else {
            System.out.println("Z podanych danych wynika, że trójkąt o takich bokach nie istnieje.");
        }
    }
}