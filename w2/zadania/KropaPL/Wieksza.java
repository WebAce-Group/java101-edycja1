import java.util.Scanner;
//Napisz program, który będzie pytał użytkownika o liczbę całkowitą tak długo,
//aż podana liczba będzie większa od 100. Program powinien wyświetlić na
//ekranie średnią arytmetyczną podanych liczb
public class Wieksza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0, ilosc = 0,liczba;
        do {
            System.out.println("Podaj liczbę:");
            liczba = scan.nextInt();
            suma += liczba;
            ilosc++;
        }while (liczba <= 100);
        System.out.println("Średnia arytmetyczna: " + suma/ilosc);
    }
}