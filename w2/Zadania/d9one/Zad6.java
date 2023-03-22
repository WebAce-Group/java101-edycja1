package w2.Zadania.d9one;
import java.util.Scanner;
public class Zad6 {
    public static void main(String[] args){
        boolean x = true;
        int y, suma=0;
        while(x==true){
           Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe:");
           y = scanner.nextInt();
           suma +=y;
           if(y==0)
               x=false;
        }
        System.out.println("Suma podanych liczb to: " + suma);
    }
}
