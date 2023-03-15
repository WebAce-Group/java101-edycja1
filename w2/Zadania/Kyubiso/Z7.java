import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        float n=0;
        float liczba;
        float srednia;
        int suma=0;
        Scanner scanner = new Scanner(System.in);
        do {
            liczba = scanner.nextInt();
            n++;
            suma += liczba;
            srednia = suma/n;
            System.out.println("Średnia arytmetyczna wynosi: "+srednia);
        } while (liczba<100);
    }
}
