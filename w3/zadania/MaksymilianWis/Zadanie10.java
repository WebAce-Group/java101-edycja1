package w3.zadania.MaksymilianWis;
import java.util.Scanner;

public class Zadanie10 {
    class Matrix
    {
        public static void createPrint()
        {
            Scanner scan = new Scanner(System.in);
            int w=0,k=0;
            
            w = scan.nextInt();
            k = scan.nextInt();
            scan.close();
            
            int[][] tab = new int[w][k];

            for(int i=0; i<w; i++)
            {
                for(int j=0; j<k; j++)
                {
                    tab[i][j] = i*w+(j+1);
                }
            }
            
            for(int i=0; i<w; i++)
            {
                for(int j=0; j<k; j++)
                {
                    System.out.println(tab[i][j]);
                }
            }

            for(int i=0; i<w; i++)
            {
                for(int j=0; j<k; j++)
                {
                    System.out.println(tab[j][i]);
                }
            }
        };
    }


public static void main(String[] args){
    Matrix.createPrint();
}
}