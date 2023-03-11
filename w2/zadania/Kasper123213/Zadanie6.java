import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean zmienna = true;
        int suma = 0;
        int liczba;

        while (zmienna) {
            liczba = scanner.nextInt();
            if (liczba != 0) suma += liczba;
            else zmienna = false;
        }
        System.out.println(suma);
    }
}
