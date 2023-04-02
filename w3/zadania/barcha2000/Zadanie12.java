import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        System.out.println("Podaj 10 imion");
        for(int i = 0; i < 10; i++) {
            String n = scanner.next();
            lista.add(n);
        }
        Collections.sort(lista);
        lista.remove(0);
        for (String n: lista) {
            System.out.print(n + "\n");
        }
    }
}