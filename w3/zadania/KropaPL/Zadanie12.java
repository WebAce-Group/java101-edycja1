import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> imiona = new ArrayList<>();
        imiona.add("Ania");
        imiona.add("Marek");
        imiona.add("Natalia");
        imiona.add("Mikołaj");
        imiona.add("Kacper");
        imiona.add("Justyna");
        imiona.add("Marcin");
        imiona.add("Dawid");
        imiona.add("Kasia");
        imiona.add("Paweł");

        Collections.sort(imiona);
        imiona.remove(0);

        for (String a : imiona) {
            System.out.println(a);
        }
    }
}