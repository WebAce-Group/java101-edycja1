package w3.zadania.Tomoo3;
import java.util.Scanner;
import java.util.Arrays;
public class Zadanie10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        int w = scanner.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę kolumn: ");
        int k = scan.nextInt();

        int[][] tablica = new int[w][k];
        int z = 1;
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tablica[i][j] = z;
                z += 1;
            }
        }
        for(int i=0; i<w; i++) {
            System.out.println(Arrays.toString(tablica[i]));
            }
        System.out.println();
        int[][] tab = new int[k][w];
        for(int x=0;x<w; x++){
            for(int y=0; y<k; y++){
                tab[x][y] = tablica[y][x];
            }
            System.out.println(Arrays.toString(tab[x]));
        }
        }
    }

