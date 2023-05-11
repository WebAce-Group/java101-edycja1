import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args)
    {
        boolean co = true;
        int suma = 0, liczba = 0;
        System.out.println("Podawaj liczby do zsumowania, jezeli bedziesz chcial zakonczyc wpisz 0");
        Scanner scanner = new Scanner(System.in);
        while( co == true)
        {
            liczba = scanner.nextInt();
            suma += liczba;
            if( liczba == 0)
            {
                co = false;
            }
        }
        System.out.println("Suma jest rowna " + suma);

    }
}