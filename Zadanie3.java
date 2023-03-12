import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        //deklaracja bokow oraz wprowadzenie ich wartosci przez uzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosci bokow a, b, c trojkata:");
        System.out.println("Bok a:");
        int a = scanner.nextInt();
        System.out.println("Bok a ma dlugosc: " + a);
        System.out.println("Bok b:");
        int b = scanner.nextInt();
        System.out.println("Bok b ma dlugosc: " + b);
        System.out.println("Bok c:");
        int c = scanner.nextInt();
        System.out.println("Bok c ma dlugosc: " + c);
        //Sprawdzanie czy z utworzonych bokow mozna utworzyc trojkat - jesli tak - sprawdzamy jaki jest to trojkat
        int suma = a + b + c;
        if (a < (suma - a) && b < (suma - b) && c < (suma - c)) {
            System.out.println("Z podanych dlugosci bokow da sie utworzyc trojkat");
        } else{
            System.out.println("Z podanych dlugosci bokow nie da sie utworzyc trojkata");
        }
        // sprawdzamy czy trojkat jest rownoboczny
            if (a == b && (a == c)) {
                System.out.println("Z podanych dlugosci bokow powstanie trojkat rownoboczny");
                // sprawdzamy czy trojkat jest rownoramienny
            } else {
                if ((a == b && b != c) || (a == c && b != c) || (b == c && a != c)) {
                    System.out.println("Trojkat jest rownoramienny");
                } else {
                    System.out.println("Trojkat jest roznoboczny");
                }
        }
    } }
