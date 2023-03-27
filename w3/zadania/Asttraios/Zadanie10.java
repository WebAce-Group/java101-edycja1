import java.util.Scanner;
import java.util.*;
public class Zadanie10 {
    
    public static void main(String [] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy: ");
        int w=input.nextInt();
        System.out.println("Podaj ilosc kolumn: ");
        int k=input.nextInt();
        input.close();
      int[][] macierz= new int[w][k];

        for(int i=0; i<w; i++)
        {
            for(int j=0; j<k; j++)
            {
                macierz[i][j]=j+1;
            }
            
        }
        
      
        for(int []elem: macierz)        //wyswietla rzad po rzedzie i jeszcze z nawiasami! JAK!?
        {
            System.out.println(Arrays.toString(elem));
        }

//POPPOPO
        
        int[][] transp = new int[k][w];
        for(int i=0; i<k; i++)
        {
            for(int j=0; j<w; j++)
            {
                transp[i][j]=macierz[j][i];
            }
            
        }
        
        System.out.println("----TRANSPONOWANA----");

        for(int []elem: transp)   
        {
            System.out.println(Arrays.toString(elem));      //dziala tylko dla kwadratowych
        }
    

    }
   

}
