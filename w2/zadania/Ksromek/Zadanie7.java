package w2.zadania.Ksromek;
import java.util.Scanner;
public class Zadanie7{
    public static void main(String[] args) {
        int suma=0;
        int licznik=0;
        int liczba;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Podaj liczbę: ");
            liczba=scanner.nextInt();
            suma=suma+liczba;
            licznik++;

        }
        while(liczba<=100);
        double srednia=suma/licznik;
        System.out.println("Średnia liczb: " +srednia);
    }
}