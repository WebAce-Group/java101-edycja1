package w2.zadania.Tomoo3;
import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args){
        float i = 0;
        float j = 0;
        float liczba;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbę całkowitą, jeżeli będzie większa od 100 program się zakończy.: ");
                liczba = scanner.nextInt();
                i = i + liczba;
                j++;
            }
            while (liczba <= 100);
        float srednia = i/j;
        System.out.println("Średnia arytmetyczna podanych liczb to: " + srednia);
        }
    }

