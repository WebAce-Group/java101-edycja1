import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double srednia = 0, suma = 0;
        int licznik = 0, liczba = 0;
        System.out.println("Podaj liczbe, jezeli chcesz zakoczyc program daj liczbe powyzej 100:");
        do {
            liczba = scan.nextInt();
            if (liczba >= 100)
                break;
            suma += liczba;
            licznik += 1;
        } while (true);
        srednia = suma / licznik;
        System.out.println(srednia);
    }
}
