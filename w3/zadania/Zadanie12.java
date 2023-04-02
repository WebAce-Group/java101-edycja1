import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        lista.add("Brąchilda");
        lista.add("Genowefa");
        lista.add("Paulina");
        lista.add("Wiktor");
        lista.add("Julka");
        lista.add("Bartek");
        lista.add("Błażej");
        lista.add("Szymon");
        lista.add("Adrain");
        lista.add("Mateusz");
        Collections.sort(lista);
        lista.remove(0);
        for (String osoba: lista) {
            System.out.println(osoba);
        }
    }
}
