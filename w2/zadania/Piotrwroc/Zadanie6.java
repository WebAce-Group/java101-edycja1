import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args)
    {
        Scanner liczba = new Scanner(System.in);
        boolean prawda=true;
        int suma=0;
        System.out.println("Petla sie konczy przy podaniu 0");
        while(prawda)
        {
            int x = liczba.nextInt();
            if (x==0) break;
            suma+=x;
        }
        System.out.println(suma);
    }
}