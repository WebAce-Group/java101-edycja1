import java.util.Scanner;

public class Zadanie9
{
    /*
     * @brief The method creates an array and saves there user's integer input, and then print all numbers
     *        raised to its index power
     * 
     * @param None
     */
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        final int[] tab = new int[10];
        int num;

        for (int i = 0; i < 10; i++)
        {
            num = scanner.nextInt();
            tab[i] = num;
        }

        int index = 0;
        for (int element : tab) 
        {
            System.out.println((int)Math.pow((double)element, (double)index));
            index++;
        }

        scanner.close();
    }
}