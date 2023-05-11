import java.util.Scanner;

public class Zadanie10
{
    /*
     * @brief The method creates two-dimensional array[w][k] (w, k are both user's input)
     *        then fill it by natural numbers from range <1, w * k> both included.
     *        In the next steps method prints array and its transposed form.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final int w, k;
        int naturalNumber = 1;

        w = scanner.nextInt();
        k = scanner.nextInt();
        final int[][] twoDimTab = new int[w][k];

        // for loop fills the array
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                twoDimTab[j][i] = naturalNumber;
                naturalNumber++;
            }
        }

        //for loop prints the array
        for (int i = 0; i < w; i++)
        {
            System.out.print("|");

            for (int[] column : twoDimTab) 
            {
                System.out.print(" " + Integer.toString(column[i]));
            }

            System.out.println(" |");
        }

        System.out.println("\n\n");

        for (int i = 0; i < k; i++)
        {
            System.out.print("| ");

            for (int j = 0; j < w; j++)
            {
                System.out.print(" " + Integer.toString(twoDimTab[i][j]));

            }

            System.out.println(" |");
        }

        scanner.close();


    }
}