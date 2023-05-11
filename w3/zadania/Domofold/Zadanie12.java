import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.printf("Podaj imię: ");
            lista.add(scanner.nextLine());
        }
        scanner.close();
        System.out.println("");

        Collections.sort(lista);
        lista.remove(0);

        for(String i: lista) {
            System.out.println(i);
        }
        
    }
}
