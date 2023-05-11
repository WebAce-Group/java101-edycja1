import java.util.Scanner;

public class Zadanie6 {
    public static void main(String arg[]) {
        boolean n = true;
        int p=0;
        while (n) {
            System.out.println("Podaj liczbę:");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            p+=n;
            if(n==0)
            {
                System.out.println("Suma podanych liczb to: "+p);
                break;
            }
        }
    }
}
