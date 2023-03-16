import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();

        System.out.println("1 - n");
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }

        System.out.println("\nn - 1");
        for(int i = n;i>=1;i--){
            System.out.println(i);
        }

        System.out.println("\n1 - n podzielne przez 3 lub 5");
        for(int i = 1;i<=n;i++){
            if(i%3 == 0 || i%5 == 0) System.out.println(i);
        }

        System.out.println("\n1 - n podzielne przez 3 lub 5 ale nie jednocześnie");
        for(int i = 1;i<=n;i++){
            if((i%3 == 0 || i%5 == 0) && i%15 != 0) System.out.println(i);
        }
    }
}
