import java.util.Scanner;

public class Zadanie7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		boolean warunek = true;
		float suma = 0;
		int ilość = 0;
		System.out.println("Podaj liczby całkowite mniejsze niż 100: ");
		do {
			int liczba = scanner.nextInt();
			if (liczba > 100) {
				warunek = false;
			}
			suma += liczba;
			ilość++;
		} while (warunek);
		System.out.println("Średnia podanych liczb: " + suma/ilość);
    }
}
