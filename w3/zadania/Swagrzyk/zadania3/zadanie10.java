import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int w = scan.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int k = scan.nextInt();
        int [][] tab = new int[w][k];
        int x=1;
        for(int i = 0;i<w;i++){
            for(int j =0;j<k;j++){
                tab[i][j] = x;
                x++;
                System.out.println(tab[i][j]);
            }
        }
        System.out.println();
        for (int i=0; i<w;i++){
            for (int j=0; j<k;j++){
                System.out.print(" "+tab[i][j]+"");
            }
            System.out.println();

        }
        System.out.println();
        for (int i=0; i<k;i++){
            for (int j=0; j<w;j++){
                System.out.print(" "+tab[j][i]+"");
            }
            System.out.println();
        }

    }
}
