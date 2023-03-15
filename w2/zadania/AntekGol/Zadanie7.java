import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma=0;
        double liczb=0;
        int n;
        do {
            System.out.print("Podaj liczbe wieksza od 100"+"\n");
            n = scanner.nextInt();
            liczb++;
            suma+=n;

        } while (n<=100);
        System.out.print("Srednia podanych liczb to: "+suma/liczb);

    }

}
