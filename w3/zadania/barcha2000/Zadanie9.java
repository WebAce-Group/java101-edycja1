import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Podaj 10 liczb calkowitych \n ");
        for(int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            tablica[i] = n;
        }
        int k = 0;
        for(int element:tablica){
            double value = pow(element, k);
            k += 1;
            System.out.println(value);
            System.out.println("\n");
        }
    }
}