package w2.zadania.mmarkowski321;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program sprawdzi czy z podanych dlugosci da się utworzyc trojkat");
        System.out.println("Wprowadz pierwsza dlugosc: ");
        a = scanner.nextInt();
        System.out.println("Wprowadz druga wartosc: ");
        b = scanner.nextInt();
        System.out.println("Wprowadz trzecia wartosc: ");
        c = scanner.nextInt();
        if (a>=b && a>=c && b+c>a) {
            System.out.println("Da się zbudować trójkąt :)");
            if (a==b && b==c){
                System.out.println("Trójkąt jest rownoboczny");
            }else if (b==c || a==c || a==b){
                System.out.println("Trójkąt jest rownoramienny");
            }else {
                System.out.println("Trójkąt jest różnoboczny");
            }
        }else if (b>=a && b>=c && c+a>b){
            System.out.println("Da się zbudować trójkąt :)");
            if (a==b && b==c){
                System.out.println("Trójkąt jest rownoboczny");
            }else if (b==c || a==c || a==b){
                System.out.println("Trójkąt jest rownoramienny");
            }else {
                System.out.println("Trójkąt jest różnoboczny");
            }
        }else if (c>=b && c>=a && a+b>c){
            System.out.println("Da się zbudować trójkąt :)");
            if (a==b && b==c){
                System.out.println("Trójkąt jest rownoboczny");
            }else if (b==c || a==c || a==b){
                System.out.println("Trójkąt jest rownoramienny");
            }else {
                System.out.println("Trójkąt jest różnoboczny");
            }
        }else {
            System.out.println("Nie da się zbudować trójkąta");
        }
    }
}
