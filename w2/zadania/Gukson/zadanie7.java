import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner userinterface = new Scanner(System.in);
        int licznik = 0, suma = 0,x;
        do {
            suma += x;
            licznik++;
        }while (x <= 100);
        System.out.println(suma/licznik);
    }
}