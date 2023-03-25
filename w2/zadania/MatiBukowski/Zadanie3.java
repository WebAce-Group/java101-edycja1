package w2.zadania.MatiBukowski;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trójkąta: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugi bok trójkąta: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzeci bok trójkąta; ");
        int c = scanner.nextInt();

        int max=0;
        int min=0;

        if(a>=b) {    //szukamy najdłuższy bok trójkąta
            if(a>=c)
                max = a;
            else max = c;
        }
        else if(a<=b) {
            if(b>=c)
                max = b;
            else max = c;
        }

        if(a<=b) {      //szukamy najkrótszy bok trójkąta
            if(a<=c)
                min = a;
            else min = c;
        }
        else if(a>=b) {
            if(b<=c)
                min = b;
            else min = c;
        }

        int trzeci = a+b+c-max-min; //trzeci bok trójkąta

        if(min+trzeci<=max)     //sprwadzanie czy da się stworzyć trójkąt
            System.out.println("Nie da się stworzyć trójkąta");
        else {
            if (a == b && b == c) {
                System.out.println("Trójkąt jest równoboczny");
            }
            else {
                if (a == b || b == c || a == c)
                    System.out.println("Trójkąt jest równoramienny");
            }

            if (a != b && a != c && b != c)
                System.out.println("Trójkąt jest różnoboczny");
        }
    }
}

