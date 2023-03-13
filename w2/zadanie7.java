import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int suma = 0;
        int proby = 0;
        do {
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            suma+= liczba;
            proby++;
        } while(liczba < 100);
        System.out.println((float)suma/proby);
    }
}
