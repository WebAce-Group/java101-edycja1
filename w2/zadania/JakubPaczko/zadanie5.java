import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);


        int n = text.nextInt();

        System.out.println("od 1 do n");

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("od n do 1");

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("od 1 do n podzielne przez 5 lub 3");
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("od 1 do n podzielne przez 5 albo 3");
        for (int i = 1; i <= n; i++) {
            if((i % 3 == 0 && i % 5 != 0) || (i % 3 != 0 && i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
