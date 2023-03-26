import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        int[] tab = new int[10];
        int[] tab2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        Arrays.fill(tab,0);
        System.out.println("Podaj wartosci drugiej tablicy:");
        for (int i =0;i<10;i++){
            tab2[i]= scanner.nextInt();
        }
        Arrays.sort(tab);
        Arrays.sort(tab2);

    }
}
