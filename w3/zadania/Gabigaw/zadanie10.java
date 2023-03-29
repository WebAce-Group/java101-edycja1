package org.example;
import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilość wierszy: ");
        int w = scanner.nextInt();
        System.out.println("ilość kolumn: ");
        int k = scanner.nextInt();

        int[][] tab = new int[w][k];

        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                if(j==0){
                    tab[i][j]=(k*i)+1;
                }else {
                    tab[i][j] = tab[i][j - 1] + 1;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Macierz: ");

        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Macierz transponowana: ");

        for(int i=0;i<k;i++){
            for(int j=0;j<w;j++){
                System.out.print(tab[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}