import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean warunek = true;
        int liczba, suma = 0;
        System.out.println("Wpisz calkowite, 0=stop");

        while (warunek){
            if((liczba = scanner.nextInt())!=0){
                System.out.println(suma+=liczba);
            }
            else {
                warunek = false;
            }

        }
    }
}
