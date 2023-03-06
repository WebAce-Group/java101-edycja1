import java.util.InputMismatchException;
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean bool = true;
        int liczba;
        int suma=0;
        while(bool){
            try {
                liczba = scanner.nextInt();
                if (liczba!=0) {
                    suma+=liczba;
                } else bool=false;
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby");
                scanner.nextLine();
               continue;
            }
        }
        System.out.println("Suma liczb wynosi: "+suma);
    }
}
