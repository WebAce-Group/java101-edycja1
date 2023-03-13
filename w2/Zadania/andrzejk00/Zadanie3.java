package w2.Zadania.andrzejk00;

import java.util.Scanner;

public class Zadanie3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podaj odcinek a: ");
        int a = getInt();
        System.out.println("Podaj odcinek b: ");
        int b = getInt();
        System.out.println("Podaj odcinek c: ");
        int c = getInt();
        if(czyTrojkat(a,b,c)){
            if(czyRownoboczny(a,b,c))
                System.out.println("z podanych odcinkow mozna utworzyc trojkat rownoboczny");
            else if (czyRownoramienny(a,b,c))
                System.out.println("z podanych odcinkow mozna utworzyc trojkat rownoramienny");
            else
                System.out.println("z podanych odcinkow mozna utworzyc trojkat roznoboczny");
        }
        else
            System.out.println("nie mozna utworzyc trojkata");
    }

    private static boolean czyTrojkat(int a, int b, int c){
        return (a + b) > c && (a + c) > b && (c + b) > a;
    }

    private static boolean czyRownoboczny(int a, int b, int c){
        return a == b && b == c;
    }

    private static  boolean czyRownoramienny(int a, int b, int c){
        return a == c || a == b || c == b;
    }

    private static int getInt(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}
