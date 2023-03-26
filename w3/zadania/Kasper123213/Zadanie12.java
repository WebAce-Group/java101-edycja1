package zadania.Kasper123213;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.addAll(List.of(new String[]{"Nowak",
                "Kowalski",
                "Nowak",
                "Nazwisko",
                "InneNazwisko",
                "Inne",
                "Aha",
                "Miały",
                "Być",
                "Imiona"}));

        Collections.sort(lista);

        lista.remove(0);
        for(String s: lista) System.out.println(s);
    }
}
