import java.util.Scanner;
public class Zadanie3 {

    public static boolean czy_mozna(int a, int b, int c){
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Podaj długości boków trójkąta:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(czy_mozna(a, b, c) == true){
            if(a == b && b == c)
                System.out.println("Twój trójkąt jest równoboczny");
            else if ((a == b) || (a == c) || (c == b))
                System.out.println("Twój trójkąt jest równoromienny");
            else
                System.out.println("Twój trójkąt jest różnoboczny");
        }
        else
            System.out.println("Nie da się z tych odcinków zbydować trójkąta");




    }
}
