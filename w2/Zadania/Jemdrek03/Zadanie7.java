import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args)
    {
        System.out.println("Podawaj liczby do wyliczenia sredniej arytmetycznej, jezeli bedziesz chcial " +
                "zakonczyc wpisz liczbe wieksza od 100");
        Scanner scanner = new Scanner(System.in);
        int n = 0, suma = 0, ilosc = 0;
        do
        {
            n = scanner.nextInt();
            ilosc++;
            suma += n;

        }while( n <= 100);
        System.out.println("srednia jest rowna: " + suma/ilosc);

    }
}