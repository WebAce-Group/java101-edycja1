import java.util.Scanner;

public class Zadanie6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		boolean warunek = true;
		int suma = 0;
		System.out.println("Podaj liczby całkowite: ");
		while (warunek) {
			int liczba = scanner.nextInt();
			if (liczba == 0) {
				warunek = false;
				continue;
			}
			suma += liczba;
		}
		System.out.println("Suma podanych liczb: " + suma);
    }
}
