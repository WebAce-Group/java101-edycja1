package w2.zadania.mmarkowski321;
import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean a=true;
        int liczba;
        int suma=0;
        while (a){
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            if (liczba==0){
                a=false;
            }
            suma+=liczba;
        }
        System.out.println(suma);
    }
}
