package w2.zadania.Maksymilian74;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugość pierwszego boku: ");
        int a = scanner.nextInt();
        System.out.println("Podaj dlugość drugiego boku: ");
        int b = scanner.nextInt();
        System.out.println("Podaj dlugość trzeciego boku: ");
        int c = scanner.nextInt();

        if(((a+b) > c) && ((b+c) > a) && ((a+c) > b)) {
            System.out.println("Da się zbudować trójkąt");
            if(a==b && b ==c)
                System.out.println("Trójkąt jest równoboczny");
            else if(a==b || b==c || a==c)
                System.out.println("Trójkąt jest równoramienny");
            else
                System.out.println("Trójkąt jest różnoboczny");
        }
        else
            System.out.println("Nie da się zbudować trójkąta");
    }
}
