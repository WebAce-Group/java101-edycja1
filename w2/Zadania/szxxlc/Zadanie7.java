import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ilosc=0, k, suma=0;
        boolean czy = true;
        do
        {
            System.out.println("Podaj liczbe calkowita. Wpisz liczbe wieksza od 100 aby przerwac program.");
            k=scanner.nextInt();
            suma=suma+k;
            ilosc++;
            if (k>100) czy=false;
        } while (czy);
        System.out.println("Srednia podanych liczb: " + suma/ilosc);
    }
}