import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        boolean b = true;
        int a, suma=0;
        Scanner scanner = new Scanner(System.in);
        while (b){
            System.out.println("podaj liczbę całkowitą:");
            a =  scanner.nextInt();
            suma+=a;
            if (a==0){
                b=false;
            }
        }
        System.out.println("Suma podanych liczb: " + suma);

    }
}
