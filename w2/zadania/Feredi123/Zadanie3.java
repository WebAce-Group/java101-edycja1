import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c: ");
        int c = scanner.nextInt();

        if(a >= b+c || b>= a+c || c >= a+b){
            System.out.println("nie da się zbudować trójkąta z takich boków");
        }
        if(a == b && b == c){
            System.out.println("trójkąt równoboczny");
        } else if (a == b || a== c || b== c) {
            System.out.println("trójkąt równoramienny");
        }
        else {
            System.out.println("trójkąt różnoboczny");
        }
    }
}
