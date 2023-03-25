import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <=100; i++)
        {
            if(i == 50)
                break;
            else if(i%3 != 0)
                continue;
            else
                System.out.println(i);
        }
    }
}
