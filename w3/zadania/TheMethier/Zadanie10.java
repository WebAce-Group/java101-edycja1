import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int matrix[][] = new int[w][h];
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < h; j++)
            {
                matrix[i][j] = i +j;
            }
        }
        for (int i[]:matrix)
        {
            for (int j:i)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        int[][] trans= new int[h][w];
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                trans[i][j]=matrix[j][i];
            }
        }
        System.out.println();

        for (int i[]:trans)
        {
            for (int j:i)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    }
