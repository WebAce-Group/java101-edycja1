import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        boolean pracuj = true;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby całkowite (0 kończy wprowadzanie):");

        while (pracuj) {
            int liczba = scanner.nextInt();
            if (liczba == 0) {
                pracuj = false;
            } else {
                suma += liczba;
            }
        }

        System.out.println("Suma to: " + suma);
    }
}