import java.util.Scanner;

public class Zadanie7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int ilosc = 0, suma = 0;
        boolean flag = true;
        do
        {
            System.out.println("Podaj liczbe:");
            int a = scanner.nextInt();
            ilosc++;
            suma+=a;
            if (a>100)
            {
                flag =!flag;
            }
        } while (flag);
        System.out.println("Średnia twoich liczb wynosi:" + (float) suma/ilosc);
    }
}
