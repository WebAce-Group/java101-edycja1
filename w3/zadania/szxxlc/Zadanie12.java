import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String imie;
        for (int i=0; i<10; i++)
        {
            System.out.println("Podaj " + (i+1) + ". imie: ");
            imie = scanner.nextLine();
            lista.add(imie);
        }

        Collections.sort(lista);
        lista.remove(0);

        System.out.println("posortowane imiona: ");
        for (String e:lista)
            System.out.println(e);

    }
}
