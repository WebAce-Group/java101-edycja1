import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int liczba;
        boolean zmienna = true;
        while (zmienna) {
            System.out.println("Podaj liczbe, jesli chcesz zakonczyc program daj zero: ");
            liczba = scan.nextInt();
            suma += liczba;
            if (liczba == 0) {
                zmienna = false;// jeżeli będzie 0 -> zmiana z true na false
            }
        }
        System.out.println(suma);
    }
}
