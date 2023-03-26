import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int b=0;
        int ilos=0;
        int a;
        do {
            System.out.println("Podaj liczbe calkowita:");
            a = scanner.nextInt();
            if (a<=100){
                b+=a;
                ilos++;
            }
            double sred = (double) b/ilos;
            System.out.println("Srednia podanych liczb: " +sred);

        }while (a<=100);
    }
}
