import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean czy = true;
        int suma=0;
        int k;
        while (czy)
        {
            System.out.println("Podaj liczbe calkowita. Wpisz 0 aby przerwac program.");
            k=scanner.nextInt();
            suma=suma+k;
            if (k==0) czy=false;
        }
        System.out.println("Suma podanych liczb: " + suma);

    }
}