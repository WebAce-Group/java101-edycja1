import java.util.Scanner;
public class Zadanie10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r, c, n = 1;
        System.out.println("Podaj liczbe wierszy: ");
            r = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
            c = scanner.nextInt();
        int[][] tab = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                tab[i][j] = n;
                System.out.print(tab[i][j] + " ");
                n++;
            }
            System.out.println();
        } 
        System.out.println("Transponowanie...");

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        } 

    }
}