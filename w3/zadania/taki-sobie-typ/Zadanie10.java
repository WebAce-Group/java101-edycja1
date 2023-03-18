import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args){
        int w,k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiersze: ");
        w = scanner.nextInt();
        System.out.print("Podaj kolumny: ");
        k = scanner.nextInt();

        int[][] arr = new int[w][k];
        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }


        //Transponowanie
        for(int j=0;j<k;j++){
            for(int i=0;i<w;i++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
