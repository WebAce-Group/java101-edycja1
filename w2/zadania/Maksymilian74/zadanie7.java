package w2.zadania.Maksymilian74;
import java.util.Scanner;
public class zadanie7 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba,suma = 0,ile = 0;
        System.out.println("Podawaj liczby całkowite");
        do{
            liczba = scanner.nextInt();
            suma += liczba;  //z polecenia zakładam, że liczba większa od 100 też ma być liczona do średniej
            ile++;
        } while(liczba <= 100);
        System.out.println("Podano liczbę większą od 100");
        System.out.println("Średnia arytmetyczna: " + (suma/(float)ile));
    }
}
