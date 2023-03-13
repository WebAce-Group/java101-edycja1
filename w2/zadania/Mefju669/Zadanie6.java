import java.util.Scanner;

public class Zadanie6
{
    public static void main(String[] args)
    {
        boolean b1=true;
        int suma=0;

        System.out.println("Zacznij wprowadzac liczby:");
        Scanner scanner=new Scanner(System.in);
        while (b1)
        {
            int wprowadzone=scanner.nextInt();
            if(wprowadzone==0)

            {
                System.out.println("Wprowadzono 0. Suma wprowadzonych liczb: "+suma);
                break;
            }
            suma=suma+wprowadzone;
            System.out.println("Podaj kolejna liczbe:");
        }
    }
}
