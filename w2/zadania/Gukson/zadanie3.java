import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        int a,b,c;
        int tab[] = new int[3];
        Scanner userInterface = new Scanner(System.in);
        a = userInterface.nextInt();
        b = userInterface.nextInt();
        c = userInterface.nextInt();

        if(a < c && b < c && a + b > c){
            if(a==b && a==c) System.out.println("trójkąt równoboczby");
            else if ( a == b && a!=c) System.out.println("trójkąt równoramienny");
        }
        else if(c < a && b < a && c + b > a){
            if(a==b && a==c) System.out.println("trójkąt równoboczby");
            else if ( c == b && c!=a) System.out.println("trójkąt równoramienny");
        }
        else if(a < b && c < b && a + c > b){
            if(a==b && a==c) System.out.println("trójkąt równoboczby");
            else if ( a == c && a!=b) System.out.println("trójkąt równoramienny");
        }
        else System.out.println("z podanych boków nie da się utworzyć trójkąta");

    }
}