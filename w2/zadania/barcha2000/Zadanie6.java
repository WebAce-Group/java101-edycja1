import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        boolean i = true;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while (i == true){
            System.out.println("Podaj liczbę całkowitą ");
            int n = scanner.nextInt();
            suma += n;
            if (n == 0){
                i = false;
            }
        }
        System.out.println("Suma to " + suma);
    }
}