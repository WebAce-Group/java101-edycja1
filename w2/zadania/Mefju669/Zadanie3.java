import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj długosc boku a:");
        int a=scanner.nextInt();
        System.out.println("Podaj dlugosc boku b:");
        int b=scanner.nextInt();
        System.out.println("Podaj dlugosc boku c:");
        int c=scanner.nextInt();

        scanner.close();

        if(a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0)
        {
            if(a==b&&b==c)
            {
                System.out.println("Trojkat rownoboczny");
            }
            if(a==b||b==c||a==c)
            {
                System.out.println("Trojkat rownoramienny");
            }
            if(!(a==b)&&!(b==c)&&!(a==c))
            {
                System.out.println("Trojkat roznoboczny");
            }
            //wiem że jak trójkąt jest równoboczny to wyświetla też równoramienny, tak chciałem zrobić bo równoboczny to też równorameinny

        }
        else
        {
            System.out.println("Nie mozna z podanych bokow zrobic trojkata!");
        }
    }
}
