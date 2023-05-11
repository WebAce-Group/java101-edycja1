import java.util.Scanner;

public class Zadanie10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w, k;
        System.out.println("Podaj ilość wierszy: ");
        w = scanner.nextInt();
        System.out.println("Podaj ilość kolumn: ");
        k = scanner.nextInt();
        int[][] Tab = new int[w][k];
        int x=1;
        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                Tab[i][j]=x;
                x++;
            }
        }
        for (int i =0;i<w;i++){
            for (int j=0;j<k;j++){
                System.out.print(Tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Macierz transponowana:");
        for (int j= 0;j<k;j++){
            for (int i=0;i<w;i++){
                System.out.print(Tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}