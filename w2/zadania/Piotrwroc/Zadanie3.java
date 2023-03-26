import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner bok = new Scanner(System.in);
        System.out.println("Podaj 3 boki trójkąta");
        int bok1 = bok.nextInt();
        int bok2 = bok.nextInt();
        int bok3 = bok.nextInt();
        if (bok1+bok2>=bok3 && bok1+bok3>=bok2 && bok2+bok3>=bok1)
        {
            if ((bok1 == bok2) && (bok1 == bok3))
            {
                System.out.println("Trojkat jest rownoboczny");
            }
            else if((bok1==bok2) || (bok1==bok3) || (bok2==bok3))
            {
                System.out.println("Trojkat jest rownoramienny");
            }
            else System.out.println("Trojkat jest roznoboczny");
        }
        else System.out.println("Nie da sie zbudowac trojkata");
    }
}