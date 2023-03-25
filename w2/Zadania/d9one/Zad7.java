package w2.Zadania.d9one;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args){
       int x, suma=0, licznik=0;
       float srednia;
       do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Podaj liczbe: ");
           x = scanner.nextInt();
           suma += x;
           licznik++;
       }while(x<101);
       srednia = suma / licznik;
        System.out.println("Srednia artymetyczna to: " + srednia);
    }
}
