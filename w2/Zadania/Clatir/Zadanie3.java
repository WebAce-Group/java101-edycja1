import java.util.Scanner;

public class Zadanie3 {



    public static void main(String [] args)
    {

        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();
        if(!(a<b+c) ||!(b<a+c) ||!(c<a+b))
            System.out.println("Nie da się zbudować trójkąta");
        else
        {
            if (a ==b && b==c)
                System.out.println("Trójkąt równoboczny");
            else if (a ==b || a==c || b==c)
                System.out.println("Trójkąt równoramienny");
            else
                System.out.println("Trójkąt różnoboczny");
        }





    }
}
