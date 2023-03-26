import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        int w, k, l=1;
        Scanner wk = new Scanner(System.in);
        System.out.println("Podaj wiersze następnie kolumny: ");
        w = wk.nextInt();
        k = wk.nextInt();
        int [][] tab = new int[w][k];
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j]=l;
                System.out.print(tab[i][j]+" ");
                l++;
            }
            System.out.println();
        }

        System.out.println("Po transponowaniu macierzy");
        //transponowanie
        for(int i=0; i<k; i++){
            for (int j=0; j<w; j++){
                System.out.print(tab[j][i]+" ");
            }
            System.out.println();
        }
    }
}
