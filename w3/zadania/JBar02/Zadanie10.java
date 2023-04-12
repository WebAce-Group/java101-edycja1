package w3.zadania.JBar02;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        int wiersze=0, kolumny = 0, x=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj liczbe wierszy: ");
        wiersze= scanner.nextInt();
        System.out.println("podaj liczbe kolumn: ");
        kolumny= scanner.nextInt();
        int [][]tab=new int [wiersze][kolumny];


        for (int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                tab[i][j]=x;
                System.out.print (tab[i][j]+"\t");//\t to tabulacja
                x++;
            }
            System.out.println (" ");
        }
        x=1;
        System.out.println("Macierz transponowana: \n");
        for (int j=0;j<kolumny;j++){
        for(int i=0;i<wiersze;i++){
            System.out.print(tab[i][j]+"\t");
                     }
            System.out.println(" ");
         }
    }
}