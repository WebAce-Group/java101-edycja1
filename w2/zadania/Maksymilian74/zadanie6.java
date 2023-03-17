package w2.zadania.Maksymilian74;
import java.util.Scanner;
public class zadanie6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean warunek = true;
        int liczba,suma = 0;
        System.out.println("Podawaj liczby całkowite");
        while(warunek == true)
        {
            liczba = scanner.nextInt();
            if(liczba==0)
                warunek = false;
            suma += liczba;
        }

        System.out.println("Podano liczbę 0");
        System.out.println("Suma liczb wynosi: " + suma);

    }
}
