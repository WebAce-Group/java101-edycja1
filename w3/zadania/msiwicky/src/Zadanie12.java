import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Maciek");
        lista.add("Ania");
        lista.add("Marek");
        lista.add("Lukasz");
        lista.add("Domin");
        lista.add("Iza");
        lista.add("Ela");
        lista.add("Piotr");
        lista.add("Maciek");
        lista.add("Michal");
        Collections.sort(lista);
        //System.out.println(lista);
        lista.remove(0);
        for (String element : lista) {
            System.out.println(element);
        }
    }
}
