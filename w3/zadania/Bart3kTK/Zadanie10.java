import java.util.Scanner;

public class Zadanie10 {

    static void pokazMaciez(int[][] maciez){
        for (int i = 0; i<maciez.length; i++){
            for (int j = 0; j< maciez[0].length; j++){
                System.out.print(maciez[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void pokazMaciezTransponowana(int[][] maciez){
        for (int i = 0; i<maciez.length; i++){
            for (int j = 0; j< maciez[0].length; j++){
                System.out.print(maciez[j][i] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar maciezy 2x2: ");
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        int[][] tab = new int[w][k];
        for (int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j] = 1+j+(10*i);
            }
        }

        pokazMaciez(tab);
        System.out.println("");
        pokazMaciezTransponowana(tab);

    }
}
