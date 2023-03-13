import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=100;i++)
        {
            System.out.println(i);
            if(i<50)
            {
                continue;
            }
            else{
                break;
            }
        }


    }
}