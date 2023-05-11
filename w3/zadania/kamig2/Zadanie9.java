import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int x=0;
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            tab[i]=scanner.nextInt();
        }

        for (int i : tab) {
            System.out.println(Math.pow(i,x));
            x++;

        }
    }

}
