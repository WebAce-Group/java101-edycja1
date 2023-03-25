package w2.zadania.Ksromek;
import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długości boków: ");
        int b1=scanner.nextInt();
        int b2=scanner.nextInt();
        int b3=scanner.nextInt();
        int n_d=0;
        if(b1>n_d)
            n_d=b1;
        if(b2>n_d)
            n_d=b2;
        if(b3>n_d)
            n_d=b3;
        int warunek=(b1+b2+b3)-n_d;
        if(warunek>n_d)
        {
            System.out.println("Istnieje trojkąt");
            if((b1==b2) && (b1==b3))
                System.out.println("Trójkąt równoboczny");
            else if(b1==b2 || b2==b3 || b1==b3)
                System.out.println("Trójkąt równoramienny");
            else
                System.out.println("Trójkąt różnoboczny");

        }
        else
            System.out.println("Nie istnieje trojkąt");

    }
}