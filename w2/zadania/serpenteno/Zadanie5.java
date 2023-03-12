import java.util.Scanner;

public class Zadanie5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj dodatnią liczbę całkowitą: ");
		int n = scanner.nextInt();
		System.out.println("Od 1 do n: ");
		for (int i=1; i<=n; i++) { 
			System.out.println(i);
		}
		System.out.println("Od n do 1: ");
		for (int i=n; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("Od 1 do n podzielne przez 3 lub 5: ");
        for (int i=1; i<=n; i++) {
			if (i%3 == 0 || i%5 == 0) 
				System.out.println(i);
		}
		System.out.println("Od 1 do n podzielne albo przez 3, albo przez 5: ");
		for (int i=1; i<=n; i++) {
			if (i%3 == 0 && i%5 == 0)
					continue;
			else if (i%3 == 0 || i%5 == 0)
				System.out.println(i);
		}
    }
}
