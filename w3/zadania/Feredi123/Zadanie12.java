import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj imie " + (i+1) + ":");
            lista.add( scanner.nextLine() );
        }

        Collections.sort(lista);
        lista.remove(0);

        for (String element : lista ) {
            System.out.println(element);
        }
    }
}
