import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        int w,k,x=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy: ");
        w= scanner.nextInt();
        System.out.println("Podaj ilosc kolumn: ");
        k= scanner.nextInt();
        int[][] tab = new int[w][k];
        for(int i =0;i<w;i++){
            for(int j=0;j<k;j++){
                tab[i][j]=x;
                x++;
            }
        }
        for (int[] i: tab) {
            for (int j : i){

                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println("Macierz transponowana: " );
        for (int i=0;i<k;i++){
            for (int j=0;j<w;j++){
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }


    }
}
