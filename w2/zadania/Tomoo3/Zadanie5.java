package w2.zadania.Tomoo3;
import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą n: ");
        int liczba = scanner.nextInt();

        System.out.println("Liczby od 1 do n:");
        for (int i = 1; i <= liczba; i++) {
            System.out.println(i);
        }
        System.out.println("Liczby od n do 1:");
        for (int i = liczba; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Liczby od 1 do n ale podzielne przez 3 lub 5");
        for (int i = 1; i <= liczba; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Liczby od 1 do n, podzielne przez 3 lub 5 ale nie jednocześnie");
        for (int i = 1; i <= liczba; i++) {
            if (i % 3 ==0 && i % 5 ==0){
                continue;
            }
            else if (i % 3 ==0){
                System.out.println(i);
            }
            else if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
