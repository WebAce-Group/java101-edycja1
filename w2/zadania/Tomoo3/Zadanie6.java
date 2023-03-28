package w2.zadania.Tomoo3;
import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args){
        boolean prawda = true;
        int i = 0;
        while (prawda) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę, jeżeli podasz liczbę 0 program zakończy działanie: ");
            int liczba = scanner.nextInt();
            if (liczba == 0){
                System.out.println("Suma podanych liczb to: "+i);
                break;
            }
            else {
                i = i + liczba;
            }
        }
    }
}
