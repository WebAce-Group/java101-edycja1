package org.example;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsze ramie trójkąta: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugie ramie trójkąta: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecie ramie trójkąta: ");
        int c = scanner.nextInt();

        if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
            System.out.println("z tych ramion da się zbudować trójkąt");
            if(a==b && a==c){
                System.out.println("trójkąt jest równoboczny");
            } else if(a==b || a==c || b==c ){
                System.out.println("trójkąt jest równoramienny");
            } else {
                System.out.println("trójkąt jest różnoboczny");
            }
        } else {
            System.out.println("nie da się zbudować trójkąta, boki muszą być dodatnie i");
            System.out.println("spełniać zasadę a+b>c, a+c>b, c+b>a ");
        }

    }
}