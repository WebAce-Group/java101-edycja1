import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("liczba całkowita n i wyświetla na ekranie wszystkie liczby od 1 do n ");
        int n = scanner.nextInt();

        System.out.println("Liczby od 1 do n:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " , ");
        }
        System.out.println();

        System.out.println(" wszystkie liczby od n do 1");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " , ");
        }
        System.out.println();

        System.out.println(" liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5");
        for (int i = 1; i <= n; i++) {
            if ( i % 5 == 0 || i % 3 == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println();

        System.out.println("liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5, ale nie jednocześnie przez oba.");
        for (int i = 1; i <= n; i++) {
            if ((i % 5 == 0 ||  i % 3 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + " , ");
            }
        }
        System.out.println();
    }
}


