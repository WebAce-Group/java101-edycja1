import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy calkowite boki trojkata: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a+b>c)
        {
            if((a=b) && (a=c))
            {
                System.out.println("trojkat rownoboczny");
            }
            else if((a=b) || (a=c) || (b=c))
            {
                System.out.println("trojkat rownoramienny");
            }else
            {
                System.out.println("trojkat roznoboczny");
            }
        }
        else
        {
            System.out.println("nie istnieje taki trojkat");
        }
    }
}