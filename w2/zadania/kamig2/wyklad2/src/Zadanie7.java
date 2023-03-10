import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args){
        int x,n=0;
        float srednia,suma=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe całkowitą:");
            x=scanner.nextInt();
            suma+=x;
            n++;
        }while (x<=100);
        srednia=suma/n;
        System.out.println(srednia);
    }
}
