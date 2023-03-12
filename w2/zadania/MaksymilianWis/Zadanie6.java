package w2.zadania.MaksymilianWis;
import java.util.Scanner;

public class Zadanie6 {
    class metody{
        public static void petla()
        {
            boolean bool = true;
            int sum = 0;
            while(bool)
            {
            Scanner scan = new Scanner(System.in);
            System.out.println("Zsumuje liczby podawane dopuki nie zostanie podane 0: ");
            int n = scan.nextInt();
            if(n!=0)
            sum += n;
            else
            {
                System.out.println("Suma podanych liczb to: " + sum);
                break;
            }
        }
    }
}

    public static void main(String[] args) {
        metody.petla();
    }
}

