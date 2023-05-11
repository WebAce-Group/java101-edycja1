import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
    int suma = 0;
    boolean stop = true;
    Scanner scanner = new Scanner(System.in);
    while (stop) {
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        suma += liczba;
        if (liczba == 0) {
            stop = false;
            System.out.println(suma);
        }
    }

    }
}

