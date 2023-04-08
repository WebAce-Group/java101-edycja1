import java.util.Scanner;


//Napisz program,który będzie pobierał od użytkownika liczby
//całkowite tak długo, aż użytkownik poda liczbę 0. Program
//powinien wyświetlić na ekranie sumę podanych liczb.

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbę! :D");
        int suma = 0;
        boolean test = true;
        while (test){
            System.out.println("Wpisz liczbę:");
            int liczba = scan.nextInt();
            suma += liczba;
            if (liczba==0) test = false;
        }
        System.out.println("Udało ci się zgadnąć :D");
        System.out.println("Suma podanych liczb: " + suma);
    }

}