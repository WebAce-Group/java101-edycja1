import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program sprawdzajacy trojkaty: ");
        System.out.println("Podaj dlugosc boku a: ");
        int a = scan.nextInt();
        System.out.println("Podaj dlugosc boku b: ");
        int b = scan.nextInt();
        System.out.println("Podaj dlugosc boku c: ");
        int c = scan.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Twoj trojkąt jest:  ");
            if (a==b && a==c && b==c)
            {
                System.out.println("Rownoboczny ");
            }
            if ((a==b && a+b>c) || (a==c && a+c>b ) || (b==c && b+c>a))
            {
                System.out.println("Rownoramienny ");
            }
            else if(a!=b && b!=c && a!=c)
            {
                System.out.println("Roznoboczny ");
            }
        }
        else
        {
            System.out.println("Nie mozna zbudowac trojkata  ");
        }
    }
}
