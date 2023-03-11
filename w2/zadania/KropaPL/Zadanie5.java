import java.util.Scanner;

//Napisz program, który pobierze od użytkownika dodatnią liczbę całkowitą n i wyświetli na ekranie wszystkie liczby od 1 do n.
//    Następnie program powinien wyświetlić wszystkie liczby od n do 1.
//    Następnie program powinien wyświetlić wszystkie liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5.
//    Następnie program powinien wyświetlić wszystkie liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5, ale nie jednocześnie przez oba.
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź ile chcesz liczb:");
        int n = scan.nextInt();

        if (n > 0) {
            System.out.println("Od n do 1");
            for (int i = 0; i < n; i++) {
                System.out.println(n - i);
            }
            System.out.println("podzielne przez 3 lub 5");
            for (int i = 0; i < n; i++) {
                if ((n - i) % 3 == 0 || (n - i) % 5 == 0){
                    System.out.println(n-i);
                }
            }
            System.out.println("Podzielne przez 3 lub 5 ale nie jednoczesnie");
            for (int i = 0; i < n; i++) {
                if (((n - i) % 3 == 0 || (n - i) % 5 == 0)&&!((n - i) % 3 == 0 && (n - i) % 5 == 0)){
                    System.out.println(n-i);
                }
            }

        } else if (n == 0) {
            System.out.println("Nie chcesz żadnych liczb :|");
        } else {
            System.out.println("Wprowadzono liczbę ujemną ;(");
        }

    }
}