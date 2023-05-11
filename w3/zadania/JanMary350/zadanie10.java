import java.util.Arrays;
import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int tab[][] = new int[w][k];
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0; i<w; i++){
            System.out.println(Arrays.toString(tab[i]));
        }
        int tab_T[][] = new int[k][w];
        for(int i=0; i<k; i++){
            for(int j=0; j<w;j++){
                tab_T[i][j] = tab[j][i];
            }
        }
        System.out.println("---------");
        for(int i=0; i<k; i++){
            System.out.println(Arrays.toString(tab_T[i]));
        }
    }
}
