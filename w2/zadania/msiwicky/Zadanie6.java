import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        boolean war = true;
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (war) {
            System.out.print("Podaj liczbe: ");
            int liczba = scanner.nextInt();
            if (liczba != 0)
                suma += liczba;
            else break;
        }
        System.out.println("Suma: " + suma);
    }