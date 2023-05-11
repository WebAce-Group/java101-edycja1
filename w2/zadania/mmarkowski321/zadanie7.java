package w2.zadania.mmarkowski321;
import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int liczbaProb=0;
        int suma=0;
        int liczba;
        do {
            System.out.println("Podaj liczbe");
            liczba = scanner.nextInt();
            suma+=liczba;
            liczbaProb++;
        }while (liczba <= 100);

        System.out.println();
        System.out.println((double)suma/liczbaProb);
    }
}
