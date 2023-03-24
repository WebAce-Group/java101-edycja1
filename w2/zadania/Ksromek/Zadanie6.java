package w2.zadania.Ksromek;
import java.util.Scanner;
public class Zadanie6{
    public static void main(String[] args) {
        boolean a=true;
        int suma=0;
        Scanner scanner = new Scanner(System.in);
        while(a)
        {
            System.out.println("Podaj liczbę: ");
            int liczba=scanner.nextInt();
            suma=suma+liczba;
            if (liczba==0)
                a=false;
        }
        System.out.println("Suma liczb: " +suma);
    }
}