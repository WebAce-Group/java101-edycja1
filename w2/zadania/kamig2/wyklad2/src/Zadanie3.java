import java.util.Scanner;

public class Zadanie3 {
    public static void jakiTrojkat(int a,int b,int c){
        System.out.println("Z podanych boków da sie utworzyć trójkąt");
        if (a == b && a == c && b == c) {
            System.out.println("Trójkąt jest równoboczny");
        } else if (a == b || a == c || b == c) {
            System.out.println("Trójkąt jest równoramienny");
        } else {
            System.out.println("Trójkat jest różnoboczny");
        }

    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku:");
        a=scanner.nextInt();
        System.out.println("Podaj długośc drugiego boku:");
        b=scanner.nextInt();
        System.out.println("Podaj długośc trzeciego boku");
        c=scanner.nextInt();
        if (a>=b && a>=c){
            if (b+c>a) {
                jakiTrojkat(a, b, c);
            }else {
                System.out.println("Z podanych boków nie da sie ułożyć trójkąta");
            }
        }else if(b>=a && b>=c){
            if (a+c>b) {
                jakiTrojkat(a, b, c);
            }else {
                System.out.println("Z podanych boków nie da sie ułożyć trójkąta");
            }
        } else if (c>=a && c>=b) {
            if (a+b>c) {
                jakiTrojkat(a, b, c);
            }else {
                System.out.println("Z podanych boków nie da sie ułożyć trójkąta");
            }
        }else{
            System.out.println("Z podanych boków nie da sie ułożyć trójkąta");
        }

    }
}